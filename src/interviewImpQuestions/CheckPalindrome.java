package interviewImpQuestions;

public class CheckPalindrome {

	public static boolean isPalindrome(String string) {
		String rev = "";
		for(int i = 0; i<string.length(); i++) {
			rev = string.charAt(i)+rev;
		}
		
		return string.equalsIgnoreCase(rev);
	}
	
	public static void main(String[] args) {
		String string = "tony";
		System.out.println("is "+"'"+string+"'"+" palindrome: "+CheckPalindrome.isPalindrome(string));
	}

}
