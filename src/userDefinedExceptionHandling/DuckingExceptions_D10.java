package userDefinedExceptionHandling;

import java.util.Scanner;

class Operation1{
	void function1() {
		System.out.println("Inside function - 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Divsion operation started");
		System.out.print("Enter number - a: ");
		int a = sc.nextInt(); // critical statement - InputMisMatchException

		System.out.print("Enter number - b: ");
		int b = sc.nextInt(); // critical statement - InputMisMatchException

		int c = a / b; // critical statement - ArithmeticException
		System.out.println(c);
		System.out.println("Divsion operation is completed");

		System.out.println("Array based operation started");
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt(); // critical statement - InputMisMatchException

		int[] arr = new int[size]; // critical statement - NegativeArraySizeException

		System.out.print("Enter the index into which value has to be stored ");
		int index = sc.nextInt();
		System.out.print("Enter the value to be stored ");
		int value = sc.nextInt();
		arr[index] = value; // critical statement - ArrayIndexOutOfBoundsException

		System.out.println("Data added");
		System.out.println("Array based operation is completed");
		sc.close();
		System.out.println("Leaving function - 1");
	}
}

class Operation2{
	void function2() {
		System.out.println("Inside function - 2");
		try {
			Operation1 op1 = new Operation1();
			op1.function1();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("Leaving function - 2");
	}
}

class Operation3{
	void function3() {
		System.out.println("Inside function - 3");
		Operation2 op2 = new Operation2();
		op2.function2();
		System.out.println("Leaving function - 3");
	}
}

class Operation4{
	void function4() {
		System.out.println("Inside function - 4");
		Operation3 op3 = new Operation3();
		op3.function3();
		System.out.println("Leaving function - 4");
	}
}

public class DuckingExceptions_D10 {

	public static void main(String[] args) {
		System.out.println("Inside main function");
		Operation4 op4 = new Operation4();
		op4.function4();
		System.out.println("Leaving main function");
	}

}
