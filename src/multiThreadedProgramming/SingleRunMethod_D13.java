package multiThreadedProgramming;

import java.util.Scanner;

class Operations extends Thread {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("add")) {
			addition();
		} else if (Thread.currentThread().getName().equals("multiply")) {
			multiply();
		} else if (Thread.currentThread().getName().equals("print1")) {
			print1();
		} else {
			print2();
		}
	}

	// 1 add method
	void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition operation is started");
		System.out.println("Enter first number for addition: ");
		int a = sc.nextInt();
		System.out.println("Enter second number for addition: ");
		int b = sc.nextInt();
		System.out.println("Addition operation is completed, the result is: " + (a + b));
		sc.close();
	}

	// 2 multiplication method
	void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication operation is started");
		System.out.println("Enter first number for multiplication: ");
		int a = sc.nextInt();
		System.out.println("Enter second number for multiplication:");
		int b = sc.nextInt();
		System.out.println("Muliplication operation is completed, the result is: " + (a * b));
		sc.close();
	}

	// 3. print1 method
	void print1() {
		System.out.println("Printing operation-1 is started:");
		for (int i = 97; i < 102; i++) {
			System.out.println((char) i); // lower case letters
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("printing operation-1 is completed");
	}

	// 4.print2 method
	void print2() {
		System.out.println("Printing operation-2 is started:");
		for (int i = 65; i < 70; i++) {
			System.out.println((char) i); // lower case letters
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("printing operation-2 is completed");
	}
}

public class SingleRunMethod_D13 {

	public static void main(String[] args) {
		Operations op1 = new Operations();
		Operations op2 = new Operations();
		Operations op3 = new Operations();
		Operations op4 = new Operations();
		
		op1.setName("add");
		op2.setName("multiply");
		op3.setName("print1");
		op4.setName("print2");
		
		op1.start();
		op2.start();
		op3.start();
		op4.start();
	}

}
