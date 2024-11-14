package palindrome.nov13;

import java.util.Scanner;

class VowelsCountLogic{
	
	int findVowelsCount(String str) {
		int count = 0;
		str = str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count+=1;
			}
		}
		return count;
	}
	
	int findUpperCaseVowelCount(String str) {
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				count+=1;
			}
		}
		return count;
	}
	
	int findLowerCaseVowelCount(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count+=1;
			}
		}
		return count;
	}
	
	void replaceVowel(String str) {
		String str_temp = "";
		str_temp = str.toLowerCase();
		for(int i=0; i<str_temp.length(); i++) {
			if(str_temp.charAt(i) == 'a' 
					|| str_temp.charAt(i) == 'e' 
					|| str_temp.charAt(i) == 'i' 
					|| str_temp.charAt(i) == 'o' 
					|| str_temp.charAt(i) == 'u') {
				System.out.print("#");
			}else {
				System.out.print(str.charAt(i));
			}
		}
	}
	
	void replaceLowerCaseVowels(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' 
					|| str.charAt(i) == 'e' 
					|| str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' 
					|| str.charAt(i) == 'u') {
				System.out.print("#");
			}else {
				System.out.print(str.charAt(i));
			}
		}
	}
	
	void replaceUpperCaseVowels(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'A' 
					|| str.charAt(i) == 'E' 
					|| str.charAt(i) == 'I' 
					|| str.charAt(i) == 'O' 
					|| str.charAt(i) == 'U') {
				System.out.print("#");
			}else {
				System.out.print(str.charAt(i));
			}
		}
	}
	
	int sumVowelPositions(String str) {
		int sum = 0;
		for(int i =0; i< str.length(); i++) {
			if(str.charAt(i) == 'a' 
					|| str.charAt(i) == 'e' 
					|| str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' 
					|| str.charAt(i) == 'u') {
				sum = sum+i;
			}
		}
		
		return sum;
	}
	
	int sumVowels(String str) {
		int sum = 0;
		for(int i =0; i< str.length(); i++) {
			if(str.charAt(i) == 'a' 
					|| str.charAt(i) == 'e' 
					|| str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' 
					|| str.charAt(i) == 'u'
					||str.charAt(i) == 'A' 
					|| str.charAt(i) == 'E' 
					|| str.charAt(i) == 'I' 
					|| str.charAt(i) == 'O' 
					|| str.charAt(i) == 'U') {
				char ch = str.charAt(i);
				sum += (int)ch;
			}
		}
		
		return sum;
	}
	
}

public class FindVowelsCount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String str = sc.nextLine();
		VowelsCountLogic vcl = new VowelsCountLogic();
		
		System.out.println("the vowel count: "+vcl.findVowelsCount(str));
		System.out.println("the upper case vowel count: "+vcl.findUpperCaseVowelCount(str));
		System.out.println("the lower case vowel count: "+vcl.findLowerCaseVowelCount(str));
		System.out.print("replace the vowels with #: ");
		vcl.replaceVowel(str);
		System.out.println();
		
		System.out.print("the lower case vowel replace: ");
		vcl.replaceLowerCaseVowels(str);
		System.out.println();
		
		System.out.print("the upper case vowel replace: ");
		vcl.replaceUpperCaseVowels(str);
		System.out.println();
		
		System.out.println("the sum of vowel positions: "+vcl.sumVowelPositions(str));
		System.out.println("the sum of vowel ascii values: "+vcl.sumVowels(str));
	}

}
