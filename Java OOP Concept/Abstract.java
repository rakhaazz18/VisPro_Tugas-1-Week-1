abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
