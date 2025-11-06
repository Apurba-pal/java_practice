import java.lang.reflect.Array;
import java.util.*;
public class pattern_printing {

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

    static void invertedPyramid(int rows){
        int x = rows*2;
        for(int i = 0; i < rows;i++){
            for(int j = 0;j <= x-1;j++){
                if((j>i) && (j<x-i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    static void diamondStar(int rows) {
    // Top part
    for (int i = 0; i < rows; i++) {
        for (int j = 1; j <= rows * 2 - 1; j++) {
            if (j >= rows - i && j <= rows + i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // Bottom part
    for (int i = rows - 2; i >= 0; i--) {
        for (int j = 1; j <= rows * 2 - 1; j++) {
            if (j >= rows - i && j <= rows + i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


    static void rightangled(int row){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pascaltriangle(int row){
        int[][] arr = new int[row][];
        for(int i = 0;i<row;i++){
            arr[i] = new int[i+1];
            for(int j = 0;j< arr[i].length;j++){
                if(j == 0 || j==i ){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
            System.out.println();
        }
for(int[] a : arr){
        for(int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    }

    static void floydTriangle(int row){
        int count = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<i;j++){
                if(count<row){
                    count++;
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
    }
    
    static void reversePyramidOfnumbers(int row){
        for( int i = 0;i<row;i++){
            for(int j = 0;j<=(row*2-1);j++){
                if((j>i)&&(j<row*2-i)){
                    System.out.print(j-i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void hollowSquareOfNumbers(int row){
        for(int i = 0;i<=row;i++){
            for(int j = 0;j<=row;j++){
                if(j == 0 || i == 0 || j == row || i == row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Xpattern(int row){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<row;j++){
                if((j==i) || ( j+i==row-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pyramidpattern(5);
      }
}