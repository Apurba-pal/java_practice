public class practice_questions {
 
    int NumberOfEvenDigits(int n){
        int count = 0;
        while (n!=0) {
            int m = n%10;
            if((m % 2) !=1){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    
    int NumberOfOddDigits(int n){
        int count = 0;
        while (n!=0) {
            int m = n%10;
            if((m % 2) ==1){
                count++;
            }
            n = n/10;
        }
        return count;
    }


    // A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
    boolean perfectNumber(int n){
    int sum = 1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (i != n / i) sum += n / i;
                }
            }
            return sum == n && n != 1;
    }

    // A Strong Number is a number such that the sum of the factorials of its digits is equal to the number itself.
    boolean isStrong(int n){
    int sum = 0;
    int temp = n;

    while (temp != 0) {
        int product = 1;
        int digit = temp % 10;

        for(int i = 1; i <= digit; i++){
            product *= i;
        }

        sum += product;
        temp /= 10;
    }

    return sum == n;
}


    // A Harshad number (also called a Niven number) is a number that is divisible by the sum of its digits.
    boolean HarshadNumber(int n){
        int temp = n;
        int sum = 0;
        while (temp!=0) {
            int m = temp%10;
            sum+=m;
            temp/=10;
        }

        return n%sum == 0;
    }
    public static void main(String[] args) {
        practice_questions p = new practice_questions();
        // System.out.println(p.NumberOfEvenDigits(2468204));
        System.out.println(p.HarshadNumber(18));
    }
}
