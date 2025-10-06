import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        Integer[]  numbers = {7,4,9,1,2,6,5,3};
        System.out.println("original value:"+ Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        // Arrays.sort(numbers, (a, b) -> b - a);
        System.out.println("sorted value :"+ Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 1);
        System.out.println(index);
        Integer[] num = {2,5,7,1,6,8,4};
        boolean equal = Arrays.equals(numbers,num);
        System.out.println(equal);
    }
}
