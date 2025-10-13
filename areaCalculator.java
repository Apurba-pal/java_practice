// method overloading

public class areaCalculator {
    double calculateArea(double side){
        return side*side;
    }
    double calculateArea(double length, double breadth ){
        return length*breadth;
    }
    double calculateArea(int radius){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        areaCalculator a = new areaCalculator();
        System.out.println(a.calculateArea(5));
        System.out.println(a.calculateArea(3));
        System.out.println(a.calculateArea(3, 5));
    }
}
