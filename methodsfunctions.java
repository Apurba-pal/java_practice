public class methodsfunctions {
    static int add(int a, int b){
        // System.out.println("sum: "+(a + b));
        return a+b;
    }
    static void difference(int a, int b){
        System.out.println("difference: "+(a - b));
    }
    static void multiply(int a, int b){
        System.out.println("product: "+(a * b));
    }
    static void divide(int a, int b){
        if(b==0){
            System.out.println("cannot divide with 0");
        }else{
            System.out.println("division: "+(a/b));
        }
    }
    static int nsum(int n){
        if ( n == 0){
            return 0;
        }else{
            return (n + nsum(n-1));
        }
    }
    
    static void pyramidpattern(int rows){
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<=(rows*2-1);j++){
                if((j >= rows - i) && (j <= rows + i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void sidewall(int row){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        sidewall(5);

    }
}