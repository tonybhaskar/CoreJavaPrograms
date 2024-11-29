package stringLogics.nov14;

import java.util.Scanner;

public class ReverseLettersInWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String sentence = sc.nextLine();
		
		String word = "";
		String result = "";
		
		for(int i = 0; i<sentence.length(); i++) {
			char ch =  sentence.charAt(i);
			if(ch != ' ') {
				word = ch + word;
			}else {
				result = result + word + " ";
				word = "";
			}
		}
		result += word;
		
		System.out.println(sentence);
		System.out.println(result);
	}

}
