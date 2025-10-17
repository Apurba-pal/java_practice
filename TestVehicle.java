// Q3. create a class vehicle with method start(). Override it in car class and use super.start() to call the parent version too.
class Vehicle { 
    public void start() {
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle {
    @Override
    public void start() {
        super.start();
        System.out.println("Car started");
    }
}
class TestVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}