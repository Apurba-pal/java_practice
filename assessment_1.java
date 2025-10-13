public class assessment_1 {
    // Q1. What is a Method in Java? Write a program to define and call a simple method.
    void Q1(){
        System.out.println("Q1. What is a Method in Java? \n Write a program to define and call a simple method. \n Method in java is a block of reusable code which can be used repeatedly");
    }
    // Q2. Write a method that adds two numbers and returns the result.
    int add(int a, int b){
        return a+b;
    }

    // Q3. Write a method to check whether a number is even or odd.
    void Odd_Even(int a){
        if(a % 2 == 0){
            System.out.println( a + " is even");
        }else{
            System.out.println(a + " is odd");
        }
    }

    // Q4. Write a method to calculate factorial of a number.
    int factorial(int a){
        if(a == 1){
            return 1;
        }else{
            return a * factorial(a-1);
        }
    }


// Q5. Write a method that reverses a string.
    String revString(String s){
        if(s == null) return null;
        int n = s.length();
        char[] rev = new char[n];
        for(int i = 0; i < n; i++){
            rev[i] = s.charAt(n - 1 - i);
        }
        return new String(rev);
    }

public static void main(String[] args) {
    assessment_1 a = new assessment_1();
    a.Q1();
    a.add(3, 2);
    a.Odd_Even(5);
    System.out.println(a.factorial(4));
    System.out.println(a.revString("String"));
}

}
