package interviewImpQuestions;


public class ReverseStringNotUsingBuiltIn {
	
	public static String reverse(String string) {
		String rev = "";
		for(int i = 0; i < string.length(); i++) {
			rev = string.charAt(i)+ rev;
		}
		return rev;
	}

	public static void main(String[] args) {
		String string = "Tony Bhaskar";
		System.out.println(ReverseStringNotUsingBuiltIn.reverse(string));
	}

}
