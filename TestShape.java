// Q6. create a superclass shape with a method area(). Create a subclass circle , rectangle, and triangle, that overrides the area methods and display their respective area formulas.

class Shape {

    public void area() {
        System.out.println("Area of shape");
    }
}
class Circle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of Circle: π * r * r");
    }
}
class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of Rectangle: length * width");
    }
}
class Triangle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of Triangle: 0.5 * base * height");
    }
}


public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();

        Shape circle = new Circle();
        circle.area();

        Shape rectangle = new Rectangle();
        rectangle.area();

        Shape triangle = new Triangle();
        triangle.area();
    }
}
