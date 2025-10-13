public class arg_returntype {
    void display(){
        System.out.println("demo class");
    }

    void add(int a, int b){
        System.out.println(a+b);
    }
    int findSquare(int n){
        return n*n;
    }

    public static void main(String[] args) {
        arg_returntype a = new arg_returntype();
        a.display();
        a.add(1,4);
        System.out.println(a.findSquare(3));
    }
}
