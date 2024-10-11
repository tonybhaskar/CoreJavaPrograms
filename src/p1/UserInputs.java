package p1;

// 1.First we need to import Scanner class
import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		//2.Create a scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		//3.Read user input
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Your name is "+name+" and you are "+age+" years old!");
		
		
	}

}
