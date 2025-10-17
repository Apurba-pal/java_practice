// Q9. overload a display method to show student details with or without address

public class studentDetalis {
    void display(String name){
        System.out.println("student details without address: \n name: " + name);
    }
    void display(String name, String Addr){
        System.out.println("student details with address: \n name: " + name + "\n address: " + Addr);
    }

    public static void main(String[] args) {
        studentDetalis s = new studentDetalis();
        s.display("ABC");
        s.display("ABC", "abc def ijk lmno");
    }
}
