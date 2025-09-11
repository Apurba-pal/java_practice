class Table{
    int num = 0;
    Table(int n){
        num = n;
    }
    public void table_multiply(){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = "+ (i * num));
        }
    }
}

public class Table_2 {
    public static void main(String[] args) {
       Table obj = new Table(4);
       obj.table_multiply();
    }
}