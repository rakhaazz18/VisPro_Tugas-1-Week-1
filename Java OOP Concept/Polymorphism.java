class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.makeSound();
    }
}
