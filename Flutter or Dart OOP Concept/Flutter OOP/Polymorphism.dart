class Animal {
	void makeSound() {
		print('Some generic animal sound');
	}
}

class Cat extends Animal {
	@override
	void makeSound() {
		print('Meow!');
	}
}

void main() {
	Animal myAnimal = Cat();
	myAnimal.makeSound();
}

