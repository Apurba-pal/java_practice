class Vehicle {
    String carName;
    int carPrice;
    public Vehicle(String carName, int carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }
    void getters(){
        System.out.println("Name of the car is " + carName);
        System.out.println("And the price of the car is Rs " +  carPrice);
    }

}
class Animal {
    String name;
    String color;
    String food;
    public Animal(){
        System.out.println("Animal constructor");
    }
    public Animal(String name, String color, String food) {
        this.name = name;
        this.color = color;
        this.food = food;
    }

    void getters(){
        System.out.println("Name of the animal is " + name);
        System.out.println("Color of the animal is " + color);
        System.out.println("Food of the animal is " + food);
    }
    static void hello(){
        System.out.println("Hello World");
    }
    static void hello(String name){
        System.out.println("Hello " + name);
    }

}

public class OOPsClass {
    public static void main(String[] args) {
        Animal.hello();
        Animal.hello("Apurba");
    }
}