package strings.nov11;

public class StringsCode2Obj {

	public static void main(String[] args) {
		// Object based representation
		
		/*
		 * Here in the object based representation they are stored in
		 * non constant pool so there we can have duplicate values 
		 * so the references are not equal
		 */
		
		String s1 = new String("Tony");
		String s2 = new String("Tony");
		String s3 = new String("tony");
		
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
