// Q1. create a parent class animal with a method makeSound(). Create a child classs Dog that overrides the method to print "dog barks". in main call the moethod using both animal and dog object. 

class  Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class TestAnimal {
    public static void main(String[] args) {

        // Q1
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); 

        Dog myDog = new Dog();
        myDog.makeSound();
    }
}

