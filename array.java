import java.lang.reflect.Array;
import java.util.*;

public class array {

    public int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]> secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public int[] sortDecending(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int maxindex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[maxindex]){
                    maxindex = j;
                }
            }
            int temp = arr[maxindex];
            arr[maxindex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
public static int reverseArrayNum(int num) {
    String str = Integer.toString(num);
    int[] arr = new int[str.length()];
    int index = 0;
    while (num != 0) {
        arr[index++] = num % 10;
        num /= 10;
    }
    int reversedNum = 0;
    for (int i = 0; i < arr.length; i++) {
        reversedNum = reversedNum * 10 + arr[i];
    }
    return reversedNum;
}




    
    public static void main(String[] args) {
        System.out.println(reverseNumber(567));
    }
}
