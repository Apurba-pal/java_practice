class A{
    void showA(){
        System.out.println("class A");
    }
}

class  B extends A{
    void showB(){
        System.out.println("class B");
    }
}


public class inheritance {
    public static void main(String[] args) {
        A a=new A();
        a.showA();
        B b = new B();
        b.showA();
        b.showB();
    }
}


