// Q8. create a calculator class to add integers and floats using method overloading

public class CalculatorClass {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculatorClass c = new CalculatorClass();

        int intSum = c.add(5, 10);
        System.out.println("Sum of integers: " + intSum);

        float floatSum = c.add(5.5f, 10.5f);
        System.out.println("Sum of floats: " + floatSum);
    }
    
}
