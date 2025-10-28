// package src.package1;

public class MainClass {
    public static void main(String[] args) {
        // upcasting
        FatherF f = new SonS();
        System.out.println("upcasting: " +f.age);

        // downcasting
        SonS s = (SonS) f;
        System.out.println("downcasting :" + s.age);
        System.out.println("downcasting :" + s.name);
        
    }
}
