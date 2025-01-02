package multiThreadedProgramming;

import java.util.Scanner;

class Addition extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition operation is started");
		System.out.println("Enter first number for addition: ");
		int a = sc.nextInt();
		System.out.println("Enter second number for addition: ");
		int b = sc.nextInt();
		System.out.println("Addition operation is completed, the result is: "+ (a+b));
		sc.close();
	}
}

class Multiplication extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication operation is started");
		System.out.println("Enter first number for multiplication: ");
		int a = sc.nextInt();
		System.out.println("Enter second number for multiplication:");
		int b = sc.nextInt();
		System.out.println("Muliplication operation is completed, the result is: "+ (a*b));
		sc.close();
	}
}

class PrintingOperation_1 extends Thread{
	@Override
	public void run(){
		System.out.println("Printing operation-1 is started:");
		for(int i = 97; i<102; i++) {
			System.out.println((char) i); // lower case letters
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("printing operation-1 is completed");
	}
}

class PrintingOperation_2 extends Thread{
	@Override
	public void run() {
		System.out.println("Printing operation-2 is started:");
		for(int i = 65; i<70; i++) {
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

public class MakeUseMultiThread_D12 {

	public static void main(String[] args) {
		Addition a = new Addition();
		Multiplication m = new Multiplication();
		PrintingOperation_1 p1 = new PrintingOperation_1();
		PrintingOperation_2 p2 = new PrintingOperation_2();
		
		a.start();
		m.start();
		p1.start();
		p2.start();
	}

}
