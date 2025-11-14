import java.util.*;

public class A {


    int[] rateLimit(int user[],int timestamp[],int k ){
        int[] results = new int[user.length];
        for(int i = 0;i<timestamp.length;i++){
            if(timestamp[i+1] < timestamp[0]+60){
                results[i] = 1;
            }else{
                results[i] = 0;
            }
        }
        return results;
    }

    void palindrome(){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int copy = num;
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if(rev == copy) System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");
    }

    static long maxLoadInWindow(int[] timestamp, int[] load, int windowSize){
        long maxload = 0;
        long currentload = 0;
        int left = 0;
        for(int right = 0;right<timestamp.length;right++){
            currentload +=load[right];

            while (timestamp[right] - timestamp[left] >= windowSize) {
                currentload -=load[left];
                left++;
            }
            maxload = Math.max(maxload, currentload);
        }

        return maxload;
    }

    int maximumSubarray(int[] arr, int k){
        // Arrays.sort(arr);
        // return arr[arr.length - k];
        if (arr == null || arr.length < k) return -1;

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for( int i = 0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<i+k;j++){
                min = Math.min(min, arr[j]);
            }
            max = Math.max(max, min);
        }
        return max;
        
    }

    public static void main(String[] args) {
        
        A a=new A();
        int []arr = {1,2,3,4,5};
        // int []arr = {2,10,1,8,5,3,7};
    
        System.out.println(a.maximumSubarray(arr, 2));

    }
}