package p1;

class Calculator{
	void add(int a, int b) {
		int c = a+b;
		System.out.println(a+" + "+b+" = "+c);
	}
	
	void subtract(int a, int b) {
		//Here the variable c is directly present inside the method/function
		//and it is local to this function which means it is only accessible within this 
		//function only
		int c = a-b;
		System.out.println(a+" - "+b+" = "+c);
	}
}

public class LocalVaribleExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.subtract(20, 10);
	}

}
