package strings.nov11;

public class CompareToCode {

	public static void main(String[] args) {
		// Compare to returns the difference between the ascii value of the Character
		String s1 = "Tony";
		String s2 = "tony";
		
		if(s1.compareTo(s2) == 0) {
			System.out.println(s1.compareTo(s2));
			System.out.println("The two strings are equal");
		}else {
			System.out.println(s1.compareTo(s2));
			System.out.println("The two strings are not equal");
		}

	}

}
