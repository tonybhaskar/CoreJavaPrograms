package strings.nov11;

public class CaseIgnore {

	public static void main(String[] args) {
		String s1 = new String("Tony");
		String s2 = new String("tony");
		
//		String s1 = "tony";
//		String s2 = "Tony";
		
		// comparing the strings 
		if(s1.equalsIgnoreCase(s2) == true) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}

		
		System.out.println("-------------");
		// checking the references
		if(s1 == s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
	}

}
