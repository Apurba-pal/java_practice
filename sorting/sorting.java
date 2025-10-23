// in place comparison s algo tracks the min value and swap vars

import java.util.Arrays;

public class sorting {
    int[] selection_sort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    int[] Insertion_sort(int[] arr){
        for(int i = 1;i<arr.length;i++){
        int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
                
            }
            arr[j+1] = temp;
            }
            return arr;
        }
    
    int[] merge_sort(int[] arr){

        int length = arr.length;
        if (length <=1) return arr;
        int middle = length/2;
        int[] leftArr =new int[middle];
        int[] rightArr =new int[length - middle];

        int i = 0;
        int j = 0;

        for(;i<length;i++){
            if(i<middle){
                leftArr[i]=arr[i];
            }else{
                rightArr[j] = arr[i];
                j++;
            }
        }

        merge_sort(leftArr);
        merge_sort(rightArr);
        merge(leftArr, rightArr, arr);

        return arr;
    }

    void merge(int[] leftArr, int[] rightArr, int[] arr){
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r<rightSize) {
            if(leftArr[l]<rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            }else{
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l<leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while (r<rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }

    }

    int[] quick_sort(int[] arr,int start,int end){
        if(end<=start) return arr;
        int pivot = partition(arr, start, end);
        quick_sort(arr, start, pivot -1);
        quick_sort(arr, pivot + 1 , end);
        return arr;
    }

    int partition(int[] arr,int start, int end){
        int pivot = arr[end];
        int i = start -1;
        for(int j = start;j<=end -1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end]= temp;
        return i;
    }

        public static void main(String[] args) {
        sorting s = new sorting();
        int[] arr = {9,1,8,2,7,3,6,4,5,0};

        // selection sort
        // int[] result = s.selection_sort(arr);
        // System.out.println(Arrays.toString(result));
        
        // int[] result = s.Insertion_sort(arr);
        // System.out.println(Arrays.toString(result));

        // int[] result = s.merge_sort(arr);
        // System.out.println(Arrays.toString(result));
        int[] result = s.quick_sort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(result));

    }
}
