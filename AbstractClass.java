public class AbstractClass  {
    public static void main(String[] args) {

        payment p = new UPIPayment();
        p.pay();
    }
}

abstract class Mobile {
    static String name;
    static float price;
    abstract String ram();
    abstract void display();
    abstract void color();
}

class Realme extends Mobile {

    @Override
    String ram(){
        return "8GB ram ";
    }

    @Override
    void display() {
        System.out.println("Super amoled");
    }

    @Override
    void color() {
        System.out.println("Mid night blue");
    }
}

abstract class V1 {
    static String name;
    static float price;
    abstract int noOfWheels();
    abstract void company();
    abstract void topSpeed();
}

class BMW_M2 extends V1 {

    @Override
    int noOfWheels() {
        return 4;
    }

    @Override
    void company() {
        System.out.println("BMW");
    }

    @Override
    void topSpeed() {
        System.out.println(280);
    }
}

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle is " + (3.14 * 7 * 7));
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle is " + ( 7 * 5 ));
    }
}

abstract class animal {
    abstract void makeSound();
}

class Dog extends animal {
    @Override
    void makeSound(){
        System.out.println("barks!");
    }
}

class cat extends animal {
    @Override
    void makeSound(){
        System.err.println("meow!");
    }
}

abstract class employee {
    String name;
    int salary = 100000;
    abstract int calculateBonus(int bonus);
}

class Manager extends employee {
    @Override
    int calculateBonus(int bonus){
        return salary + bonus;
    }
}

class Clerk extends employee {

    @Override
    int calculateBonus(int bonus){
        return salary + bonus + 1000;
    }
}

abstract class payment {

    abstract void pay();
}

class CreditcardPayment extends payment {
    @Override
     void pay(){
        System.out.println("credit card payment");
     }
}

class UPIPayment extends payment {
    // @Override
    void pay(){
        System.out.println("UPI payment");
    }
    
}