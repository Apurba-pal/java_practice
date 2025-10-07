import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        // int[][] arr = new int[][];
        int [][] numbers = {
            {1,2,3},
            {4,5,6,23},
            {7,8,9}
        };
        // for( int[] row : numbers){
        //     System.out.println(Arrays.toString(row));
        // }

        // for( int i = 0;i< numbers.length;i++){
        //     for(int j = 0;j<numbers[i].length;j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // String[][] menu = {
        //     {"A", "30"},
        //     {"B", "40"},
        //     {"C", "50"},
        //     {"D", "60"},
        // };
        // for(String[] item : menu){
        //     System.out.println("item: " + item[0] + "---" + item[1]);
        // }

        // System.out.println("while loop");

        // int i = 0;
        // while (i<menu.length) {
        //     System.out.println(menu[i][0] + " = " + menu[i][1]);
        //     i++;
        // }

        int [][] nums = {
            {1,3, 9},
            {2,5, 6},
            {8,4, 7}
        };
        int max = nums[0][0];
        for(int[] num : nums){
            for(int n : num){
                if(n > max){
                    max = n;
                }
            }
        }
        System.out.println("max=" + max);
    }
}
