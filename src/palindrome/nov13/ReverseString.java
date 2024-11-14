package palindrome.nov13;

import java.util.Scanner;

class ReverseStringLogic{
	
	String reverseString(String str) {
		String reversed_str = "";
		
		for(int i = str.length() - 1; i>=0; i--) {
			reversed_str = reversed_str + str.charAt(i);
		}
		
		return reversed_str;
	}
	
}

public class ReverseString {

	public static void main(String[] args) {
		// Reverse the given string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		

		System.out.println("The original string is: "+str);
		System.out.println("-------------------------------");
		
		ReverseStringLogic rsl = new ReverseStringLogic();
		
		System.out.println("The reversed string is: "+rsl.reverseString(str) +"\n");

	}

}
