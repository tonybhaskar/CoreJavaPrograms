package com.basics.oct14;

public class ForLoopExample {

	public static void main(String[] args) {
		
		// Printing 1 to 10 using for loop 
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		//Looping through an array 
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+":"+arr[i]);
		}
		
	}

}