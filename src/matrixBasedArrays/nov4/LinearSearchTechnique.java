package matrixBasedArrays.nov4;

import java.util.Scanner;

public class LinearSearchTechnique {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Collecting the elements");
		for(int i =0; i<arr.length; i++) {
			System.out.println("Enter "+(i+1)+ " value");
			arr[i] = sc.nextInt();
		}
		System.out.println("Displaying the data: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the value to search: ");
		int key = sc.nextInt();
		System.out.println("Searching the value: ");
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Value found at index: "+(i+1));
				System.exit(0);
			}
		}
		System.out.println("Value not found..!");
		
		sc.close();
		
	}

}
