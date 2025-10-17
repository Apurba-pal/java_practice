// Q7. print the area of a circle and a rectangle using method overloading

class AreaCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }
}


public class AreaUsingMOverloading {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();

        double circleArea = a.calculateArea(5.0);
        System.out.println("Circle : " + circleArea);

        double rectangleArea = a.calculateArea(4.0, 6.0);
        System.out.println("Rectangle : " + rectangleArea);
    }
}
