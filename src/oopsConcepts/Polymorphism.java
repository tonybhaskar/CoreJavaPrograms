package oopsConcepts;

class Calculate{
	void add(int a, int b) {
		System.out.println(a + " + " + b +" = "+(a+b));
	}
	
	void add(double a, double b) {
		System.out.println(a + " + " + b +" = "+(a+b));
	}
}


class Animal2{
	void sound() {
		System.out.println("Animals makes a sound.");
	}
}
class Cow extends Animal2{
	
	@Override
	void sound() {
		System.out.println("Cows-moo");
	}
}




public class Polymorphism {

	public static void main(String[] args) {
//		Calculate cal = new Calculate();
//		cal.add(1, 2);
//		cal.add(12.4, 13.3);
		
		Cow cow = new Cow();
		cow.sound();
		
	}

}
