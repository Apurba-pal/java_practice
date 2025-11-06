package Basic;

public class Mynthra {

    public static void main(String[] args)
    {
       Mynthra obj = new Mynthra();
       obj.purchase();
       obj.purchase(10);
       obj.purchase(20, 30);
       obj.purchase(12003.6);
       obj.purchase("UPI methods");


    }

    void purchase(){
        System.out.println("Purchase method");
    }
    void purchase(int x){
        System.out.println("Purchase " + x + " items");
    }
    void purchase(int x, int y){
        System.out.println("Purchase " + x + " and " + y + " items");
    }
    void purchase(double total){
        System.out.println("Total amount " + total);
    }
    void purchase(String paymentMethod){
        System.out.println("Purchase using  " + paymentMethod);
    }

}