package oopsConcepts;

class Animal{
	void eat() {
		System.out.println("This animal eats food.");
	}
}

// it promotes code re-use and establishes is-a relation ship

class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks.");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.bark();
		dog.eat();
		
	}

}
