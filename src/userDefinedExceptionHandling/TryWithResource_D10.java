package userDefinedExceptionHandling;

import java.util.Scanner;

public class TryWithResource_D10 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a: ");
			int a = sc.nextInt();
			System.out.println(a);
		}
	}

}
