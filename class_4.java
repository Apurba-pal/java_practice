import java.util.Scanner;

public class class_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] students1 = new String[n];
        System.out.println("\nEnter " + n + " student names (for loop input):");
        for (int i = 0; i < students1.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            students1[i] = scanner.nextLine();
        }
        System.out.println("\nStudents1 (using for loop):");
        for (int i = 0; i < students1.length; i++) {
            System.out.println(students1[i]);
        }

        String[] students2 = new String[n];
        System.out.println("\nEnter " + n + " student names (while loop input):");
        int j = 0;
        while (j < students2.length) {
            System.out.print("Student " + (j+1) + ": ");
            students2[j] = scanner.nextLine();
            j++;
        }
        System.out.println("\nStudents2 (using while loop):");
        j = 0;
        while (j < students2.length) {
            System.out.println(students2[j]);
            j++;
        }

        String[] students3 = new String[n];
        System.out.println("\nEnter " + n + " student names (do-while loop input):");
        int k = 0;
        do {
            System.out.print("Student " + (k+1) + ": ");
            students3[k] = scanner.nextLine();
            k++;
        } while (k < students3.length);
        System.out.println("\nStudents3 (using do-while loop):");
        k = 0;
        do {
            System.out.println(students3[k]);
            k++;
        } while ( k < students3.length);

        scanner.close();
    }
}