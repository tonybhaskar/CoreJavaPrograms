package userDefinedExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GroupingExceptions_D10 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Divsion operation started");
			System.out.print("Enter number - a: ");
			int a = sc.nextInt(); // critical statement - InputMisMatchException

			System.out.print("Enter number - b: ");
			int b = sc.nextInt(); // critical statement - InputMisMatchException

			int c = a / b; // critical statement - ArithmeticException
			System.out.println(c);
			System.out.println("Divsion operation is completed");

			System.out.println("Array based operation started");
			System.out.println("Enter the size of the array: ");
			int size = sc.nextInt(); // critical statement - InputMisMatchException

			int[] arr = new int[size]; // critical statement - NegativeArraySizeException

			System.out.print("Enter the index into which value has to be stored ");
			int index = sc.nextInt();
			System.out.print("Enter the value to be stored ");
			int value = sc.nextInt();
			arr[index] = value; // critical statement - ArrayIndexOutOfBoundsException

			System.out.println("Data added");
			System.out.println("Array based operation is completed");

		} catch (InputMismatchException e1) {
			System.out.println("Invalid input is provided");
		} catch (ArithmeticException e2) {
			System.out.println("Can't divide by zero");
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e3) {
			System.out.println("Array size can't be negative or specified length is beyond the size");
		} catch (Exception e) {
			System.out.println("error handled");
		}
	}

}
