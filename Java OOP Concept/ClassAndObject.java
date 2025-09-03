class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        person1.introduce();

        Person person2 = new Person("Bob", 30);
        person2.introduce();
    }
}
