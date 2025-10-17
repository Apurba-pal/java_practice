public class Student {
    static int age = 10;
    static{
        age = 20;
    }
    public static void main(String[] args) {
        System.out.println(Student.age);
    }
    static{
        age = 30;
    }
}
