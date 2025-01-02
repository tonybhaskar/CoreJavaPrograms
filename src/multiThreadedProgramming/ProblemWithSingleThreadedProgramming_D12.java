package multiThreadedProgramming;

import java.util.Scanner;

public class ProblemWithSingleThreadedProgramming_D12 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition operation is started");
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Addition operation is completed, the result is: "+ (a+b));
		System.out.println("===================================");

		System.out.println("multiplication operation is started");
		System.out.print("Enter first number: ");
		int c = sc.nextInt();
		System.out.print("Enter second number: ");
		int d = sc.nextInt();
		System.out.println("Multiplication operation is completed, the result is: "+ (c*d));
		System.out.println("===================================");
		
		System.out.println("Printing operation-1 is started:");
		for(int i = 97; i<102; i++) {
			System.out.println((char) i);
			Thread.sleep(3000);
		}
		System.out.println("printing operation-1 is completed");
		System.out.println("===================================");
		
		System.out.println("Printing operation-2 is started:");
		for(int i = 65; i<70; i++) {
			System.out.println((char) i);
			Thread.sleep(3000);
		}
		System.out.println("printing operation-2 is completed");
		
		sc.close();
	}

}
