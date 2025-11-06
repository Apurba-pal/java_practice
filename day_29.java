public class day_29 {
    public static void main(String[] args) {
        // Circle shape = new Circle();
        // shape.print();
        // Circle re = (Circle) shape;
        // re.print();

        Shape s = new Rectangle();
        s.print();
        Circle c = (Circle) s;
        c.getArea();

    }
}

class Shape {
    void print(){
        System.out.println("Shape class");
        
    }
}

class Rectangle extends Shape {
    @Override
    void print(){
        System.out.println("Rectangle class");
    }
}

class Circle extends Shape {
    @Override
    void print(){
        System.out.println("Circle class");
    }

    void getArea(){
        System.out.println("just a method!");
    }
}
