package userDefinedExceptionHandling;

import java.util.Scanner;

public class GenericEH_D9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number - a: ");
			int a = sc.nextInt();
			
			System.out.print("Enter number - b: ");
			int b = sc.nextInt();
			
			int c = a/b;
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println("exception handled ");
		}
	}

}
