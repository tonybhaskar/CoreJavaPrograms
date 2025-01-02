package interviewImpQuestions;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String string = "malayalam";
		System.out.println(removeDuplicates(string));
	}
	
	public static String removeDuplicates(String string) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i =0; i<string.length(); i++) {
			set.add(string.charAt(i));
		}
		
		// build the string
		StringBuilder sb = new StringBuilder();
		for(char c: set) {
			sb.append(c);
		}
		
		return sb.toString();
	}

}
