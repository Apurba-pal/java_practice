import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine();
        System.out.print("Enter class: ");
        String className = scanner.nextLine();

        // Subjects
        String[] technologies = {"Java", "Python", "C++", "Data Structures", "Algorithms", "Web Development"};
        int[] marks = new int[technologies.length];

        // marks input
        System.out.println("\nEnter marks (out of 100) for each subject:");
        for (int i = 0; i < technologies.length; i++) {
            System.out.print(technologies[i] + ": ");
            marks[i] = scanner.nextInt();
            
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks. Re-enter marks for " + technologies[i] + " (0-100): ");
                marks[i] = scanner.nextInt();
            }
        }
        

        // total marks and percentage
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = (double) totalMarks / (technologies.length * 100) * 100;

        // grade
        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F";

        // report card
        System.out.println("\n ---- Student Report Card ----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Class: " + className);
        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < technologies.length; i++) {
            System.out.println(technologies[i] + ": " + marks[i]);
        }
        System.out.printf("\nTotal Marks: %d / %d\n", totalMarks, technologies.length * 100);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}