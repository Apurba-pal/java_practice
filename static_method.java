import java.util.Scanner;

public class static_method {

    static void quoteInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a quote: ");
        String quote = sc.nextLine();
        System.out.println("input : " + quote);
        System.out.println("length: " + quote.length());
    }

    static void positiveEvenNo(int n){
        if (n % 2 == 0 && n > 0) {
            System.out.println("positive even number");
        }else{
            System.out.println("not a positive even number");
        }
    }

public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter name: ");
        // String name = sc.nextLine();
        // System.out.println("Enter age: ");
        // int age = sc.nextInt();
        // System.out.println("Enter salary: ");
        // double salary = sc.nextDouble();
        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);
        // System.out.println("Salary: " + salary);
        // sc.close();
        // print();
        // print(1);

        static_method s = new static_method();
        System.out.println("enter a number");
        int n = sc.nextInt();
        s.positiveEvenNo(n);
        // s.quoteInput();
    }
    public static void print() {
        System.out.println("This is a method.");
    }
    
    public static void print(int n) {
        System.out.println("Method overridden.");
    }  
}