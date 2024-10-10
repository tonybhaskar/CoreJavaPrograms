package p1;


class Dog {

	String  name;
	int cost;
	String breed;
	int age;
	String color;
	
	void addData(int a, int b, String c, String d, String e) {
		name = c;
		color = d;
		breed = e;
		cost = a;
		age = b;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(color);
	}
	
}






public class InstaceExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
		d.addData(7000,2, "Jimmy", "black", "GR");
		d.display();
	}

}
