public class Whatsapp1 {
    void display(){
        System.out.println("whatsapp1");
    }
    public static void main(String[] args) {
        
    }
}

class InnerWhatsapp2 extends Whatsapp1 {
    @Override
    void display(){
        super.display();
        System.out.println("whatsapp2");
    }

    public static void main(String[] args) {
        InnerWhatsapp2 iw = new InnerWhatsapp2();
        iw.display();
    }
}