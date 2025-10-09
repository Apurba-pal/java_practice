public class Vehicle {
    String name ;
    float price ;
    public Vehicle(String name, float price){
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("ABCD", 1200);
        System.out.println(v.name);
        System.out.println(v.price);
        
    }
}


