package strings.nov11;

public class CompareToIgnoreCaseCode {

	public static void main(String[] args) {
		// Compare to returns the difference between the ascii value of the Character ignoring the case
		String s1 = "Tony";
		String s2 = "tony";
		
		System.out.println(s2.indexOf('y', 0, 3));
		if(s1.compareToIgnoreCase(s2) == 0) {
			System.out.println(s1.compareToIgnoreCase(s2));
			System.out.println("The two strings are equal");
		}else {
			System.out.println(s1.compareToIgnoreCase(s2));
			System.out.println("The two strings are not equal");
		}
	}

}
