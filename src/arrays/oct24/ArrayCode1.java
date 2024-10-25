package arrays.oct24;

import java.util.Scanner;

class ArrayOperations{
	int arr[];
	Scanner sc = new Scanner(System.in);
	
	void createArray(int n) {
		arr = new int[n];
		System.out.println("Array created..!");
	}
	
	void addData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the marks of the student no: "+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Data is added..!");
	}
	
	void displayData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("The marks of student no: "+(i+1)+" is = "+arr[i]);
		}
	}
}

public class ArrayCode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ");
		int n = sc.nextInt();
		
		ArrayOperations ao = new ArrayOperations();
		ao.createArray(n);
		System.out.println("-----------------");
		ao.addData();
		System.out.println("-----------------");
		ao.displayData();
	}

}
