// package src.package1;

public class Typecasting {
    public static void main(String[] args) {
        System.out.println("widening");
        int a = 10;
        double b = a;
        System.out.println("a : " + a + " b : "+b);
        char c = 'A';
        int d = c;
        System.out.println(c + " "+d);
        System.out.println("------------");

        System.out.println("narrowing");
        double x = 5.5000000;
        int y = (int) x;
        System.out.println("x :"+x+" y : "+y);
        int p = 99;
        char q = (char) p;
        System.out.println("p : "+p+" q : "+q);
    }
}
