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

    public static void main(String[] args) {
        practice_questions p = new practice_questions();
        // System.out.println(p.NumberOfEvenDigits(2468204));
        System.out.println(p.NumberOfOddDigits(121211));
    }
}
