package p1;

class Dog2 {
	static String name;
	static String breed;
	static String color;
	static int age;
	static int price;
	
	
	static void display() {
		System.out.println("name: "+name);
		System.out.println("breed: "+breed);
		System.out.println("color: "+color);
		System.out.println("age: "+age);
		System.out.println("price: "+price);
		System.out.println("--------------------");
	}
	
}

public class StaticVariableExample {

	public static void main(String[] args) {
		
		Dog2.display();// it displays the default values which are allocated by JVM
		
		
		// We are overriding the values of Dog2's static varibles here
		Dog2.name = "Jimmy";
		Dog2.breed = "GR";
		Dog2.color = "Brown";
		Dog2.age = 2;
		Dog2.price = 7000;
		
		Dog2.display();//it displays the values given by us
	}

}
