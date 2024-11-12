package strings.nov11;



public class StringCode1 {

	public static void main(String[] args) {
		// Literal Based Representation		
		
		/*
		 * it will be stored in constant pool so it won't allow
		 * duplicates so the references are also equal
		 */
		String s1 = "Tony";
		String s2 = "Tony";
		
		// comparing the strings 
		if(s1.equals(s2) == true) {
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
