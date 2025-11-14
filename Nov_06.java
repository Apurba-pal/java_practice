// interface Vehicle {
//     void start();
// }

// class Car implements Vehicle {

// }

interface i1 {
    void simple();   
}
interface i2{
    void show();
}

interface q1{
    void show();
}
interface q2{
    void display();
}

class pritam implements q1, q2{
    public void show(){
        System.out.println("show");
    }

    public void display(){
        System.out.println("display");
    }

    public static void main(String[] args) {
        pritam p = new pritam();

    }
}

public class Nov_06 implements i1, i2{
    public void simple(){
        System.out.println("hello");
    }

    public void show(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.engine();
        // myCar.accident();

        Nov_06 n = new Nov_06();
        n.show();
        n.simple();


    }
}

interface MathConstants {
    double PI = 3.14159;
    double E = 2.71828;
}

class Circle implements MathConstants {
    double radius;
    Circle(double r) { radius = r; }

    void area() {
        System.out.println("Area: " + (PI * radius * radius));
    }
}

interface Greeting {
    default void sayHello() {
        System.out.println("Hello from interface!");
    }
}

class Welcome implements Greeting { }

interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

interface Shape {
    void draw();
}

class Square implements Shape {
    public void draw() { System.out.println("Drawing square"); }
}


interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() { return 6.5f; }
}

class HDFC implements Bank {
    public float rateOfInterest() { return 7.0f; }
}



class Main {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        w.sayHello();
        System.out.println(Calculator.add(5, 3));
        Shape s = new Square();  // interface reference
        s.draw();
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println("SBI ROI: " + b1.rateOfInterest());
        System.out.println("HDFC ROI: " + b2.rateOfInterest());
    }
}