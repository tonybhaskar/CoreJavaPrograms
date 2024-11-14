package palindrome.nov13;

import java.util.Scanner;

class PalindromeLogic{
	
	static String reverseString(String str) {
		String reversed_str = "";
		
		for(int i = str.length() - 1; i>=0; i--) {
			reversed_str = reversed_str + str.charAt(i);
		}
		
		return reversed_str;
	}
	
	boolean isPalindrome(String str) {
		String str_temp = reverseString(str);
		if(str_temp.equalsIgnoreCase(str) == true) {
			return true;
		}
		return false;
	}
	
}

public class Palindrome {

	public static void main(String[] args) {
		// To check the given string is Palindrome or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		PalindromeLogic pl = new PalindromeLogic();
		if(pl.isPalindrome(str) == true) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("The given string is not a palindrome");
		}
		
	}

}
