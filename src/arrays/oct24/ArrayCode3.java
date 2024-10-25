package arrays.oct24;

import java.util.Scanner;

class StudentNames{
	
	String arr[][];
	Scanner sc = new Scanner(System.in);
	
	void createArray(int m, int n) {
		arr = new String[m][n];
		System.out.println("Array created..!");
	}
	
	void addData() {
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Inside the class no: "+(i+1));
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("Enter the name of student no: "+(j+1));
				arr[i][j] = sc.nextLine();
			}
		}
	}
	
	void disaplyData() {
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Inside the class no: "+(i+1));
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("The name of student no "+(j+1)+" is :"+arr[i][j]);
			}
		}
	}
	
}

public class ArrayCode3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class number");
		int m = sc.nextInt();
		
		System.out.println("Enter the students number");
		int n = sc.nextInt();
		
		StudentNames student = new StudentNames() ;
		student.createArray(m, n);
		student.addData();
		student.disaplyData();
	}
}
