package multiThreadedProgramming;

import java.util.Scanner;

class Operations_2 implements Runnable{

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

public class RunnableInterface_D13 {

	public static void main(String[] args) {
		Operations_2 op1 = new Operations_2();
		Thread t1 = new Thread(op1);
		
		Operations_2 op2 = new Operations_2();
		Thread t2 = new Thread(op2);
		
		Operations_2 op3 = new Operations_2();
		Thread t3 = new Thread(op3);
		
		Operations_2 op4 = new Operations_2();
		Thread t4 = new Thread(op4);
		
		t1.setName("add");
		t2.setName("multiply");
		t3.setName("print1");
		t4.setName("print2");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
