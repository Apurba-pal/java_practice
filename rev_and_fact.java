public class rev_and_fact {
     public static int reverseNumber(int n) {
        int new_num = 0;
        while (n > 0) {
            int m = n % 10;
            new_num = new_num * 10 + m;
            n = n / 10;
        }
        return new_num;
    }

    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;   // multiply result by i
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(rev_and_fact.factorial(5));
        System.out.println(rev_and_fact.reverseNumber(123));
    }
}
