class Person {
	String name;
	int age;

	Person(this.name, this.age);

	void introduce() {
		print('Hello, my name is $name and I am $age years old.');
	}
}

void main() {
	Person person1 = Person('Alice', 25);
	person1.introduce();

	Person person2 = Person('Bob', 30);
	person2.introduce();
}

