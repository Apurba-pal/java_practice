public class questions_3 {
    static void area(float r) {
        System.out.println("Area of the circle: " + 3.14 * r * r);
    }
    static void area(float w, float b) {
        System.out.println("Area of the rectangle: " + w * b);
    }
    static void display(String name) {
        System.out.println("Name of the student: " + name);
    }
    static void display(String name, String address) {
        System.out.println("Name of the student: " + name);
        System.out.println("Address of the student: " + address);
    }
    static void calculator(int a, int b) {
        System.out.println(a + " + " + b + " = " + a + b);
    }
    static void calculator(float a, float b) {
        System.out.println(a + " + " + b + " = " + a + b);
    }
    static void booking(String bus, int seats) {
        System.out.println(bus + " booking confirmed for " + seats + " seats");
    }

    static void booking(String train, String from, String to) {
        System.out.println(train + " booking confirmed from " + from + " to " + to);
    }

    static void booking(String flight, String from, String to, String date) {
        System.out.println(flight + " booking confirmed from " + from + " to " + to + " on " + date);
    }
    // overload a method to calculate employee salary calculation
    static void calculateSalary(int basic, int allowances) {
        int salary = basic + allowances;
        System.out.println("Salary: " + salary);
    }
    static void calculateSalary(int basic) {
        int hra = (int)(0.2 * basic);
        int da = (int)(0.5 * basic);
        int salary = basic + hra + da;
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
        area(5.5f);
        area(4.0f, 6.0f);
        display("John");
        display("John", "123 Main St");
        calculator(5, 10);
        calculator(5.5f, 10.5f);
        booking("Express Bus", 3);
        booking("Rajdhani Express", "Delhi", "Mumbai");
        booking("IndiGo", "Delhi", "Mumbai", "2023-10-16");
        calculateSalary(5000, 2000);
        calculateSalary(5000);
    }
}