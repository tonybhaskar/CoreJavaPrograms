package oopsConcepts;

abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("drawing a circle");
	}
}


public class Abstract {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
	}
}
