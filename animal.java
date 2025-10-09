public class animal {
    String name;
    int age;
    String color;


    public animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void disp(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("color: " + color);
    }

}
