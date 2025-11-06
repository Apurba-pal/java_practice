public class practicee {
    static void diamondStar(int rows) {
    
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

    static void pyramidpattern(int rows){
        for(int i = 0;i<rows;i++){
            int k = 1;
            for(int j = 0;j<=(rows*2-1);j++){
                if((j >= rows - i) && (j <= rows + i)){
                    if(k > rows){
                        System.out.print(k--);
                    }else{
                        System.out.print(k++);
                    }
                }else{
                    System.out.print(" ");
                }
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
    
    static void hollowDiamond(int rows){
        for (int i = 0; i < rows; i++) {
        for (int j = 1; j <= rows * 2 - 1; j++) {
            if (j == rows - i || j == rows + i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    
    for (int i = rows - 2; i >= 0; i--) {
        for (int j = 1; j <= rows * 2 - 1; j++) {
            if (j == rows - i || j == rows + i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
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

    static void alphabetPyramid(int rows){
        for(int i = 0;i<rows;i++){
            char CH= 'A';
            for(int j = 0;j<=(rows*2-1);j++){
                if((j >= rows - i) && (j <= rows + i)){
                    System.out.print(CH++);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


public static void main(String[] args) {
    practicee p = new practicee();
    p.diamondStar(5);
    p.pyramidpattern(5);
    p.floydTriangle(15);
    p.hollowDiamond(5);
    p.pascaltriangle(5);
    p.alphabetPyramid(5);
}
}
