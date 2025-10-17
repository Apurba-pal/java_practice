public class oct_17 {
    oct_17(int id){
        System.out.println(id);
    }
    public static void main(String[] args) {
        Bike obj1 = new Bike();
        Bike obj2 = new Bike(100000);
        obj2.display();

        System.out.println(obj2.price);
    }
}


class Bike {
    int price;
    Bike (){
        System.out.println("Default Bike Constructor ");
    }
    Bike(int price){
        this.price = price;
        System.out.println("Parameterized Constructor and the Price of the bike is " + price);
    }

    void display(){
        int price = 20;
        System.out.println(price);
        System.out.println(this.price);
    }
}