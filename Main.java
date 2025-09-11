class Calculator {

    // Addition
    public int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subOfTwoNumbers(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    // Division
    public float divideTwoNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (float) a / b;
    }

    // Modulo
    public int moduloTwoNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulo by zero is not allowed.");
            return 0;
        }
        return a % b;
    }

    // Even / Odd check
    public String checkEvenOdd(int num) {
        if ((num & 1) == 0) {
            return "even";
        }
        return "odd";
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        // take numbers from terminal args
        // if (args.length < 2) {
        //     System.out.println("Please provide at least 2 numbers as arguments.");
        //     return;
        // }

        int a = Integer.parseInt(args[0]);  // first number
        // int b = Integer.parseInt(args[1]);  // second number
        int b = 5;

        System.out.println("Sum = " + c.sumOfTwoNumbers(a, b));
        System.out.println("Subtraction = " + c.subOfTwoNumbers(a, b));
        System.out.println("Multiplication = " + c.multiplyTwoNumbers(a, b));
        System.out.println("Division = " + c.divideTwoNumbers(a, b));
        System.out.println("Modulo = " + c.moduloTwoNumbers(a, b));

        // If a third number is provided, check even/odd
        if (args.length >= 1) {
            int num = Integer.parseInt(args[0]);
            System.out.println(c.checkEvenOdd(num));
        } else {
            System.out.println("No number provided for Even/Odd check.");
        }
    }
}
