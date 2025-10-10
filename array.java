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
    

    
    public static void main(String[] args) {
       array a = new array();
        int[] arr = {5, 2, 9, 1, 7};
        System.out.println(Arrays.toString(a.sortDecending(arr)));
    }
}
