import java.util.*;
public class day2 {

    private static final int MAX_VALUE = 100; 

    public static void main(String[] args) {
        // Identifiers
        int studentId = 10;
        float marks = 95.5f;
        double salary = 50000;
        char grade = 'A';
        boolean isPassed = true;
        String name = "Java";
        Object obj = null;

        // Control statements
        if (isPassed && marks > 50) {
            System.out.println(name + " passed!");
        } else {
            System.out.println(name + " failed!");
        }

        // Loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Switch-case
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            default:
                System.out.println("Needs Improvement");
        }

        // While loop
        int count = 0;
        while (count < 3) {
            count++;
        }

        // Do-while loop
        do {
            count--;
        } while (count > 0);

        // Exception handling
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {   // keyword: finally
            System.out.println("Finally block executed");
        }

        // Object creation using new
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // Instanceof
        if (list instanceof List) {
            System.out.println("list is a List");
        }

        // Using return
        System.out.println("Lucky number: " + getLuckyNumber());
    }

    
    public static int getLuckyNumber() {
        return 7;
    }
}

// Example of inheritance
class Parent {
    public void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        super.show();
        System.out.println("Child method using this: " + this.toString());
    }
}