package strings.nov11;

public class BuiltInMethodsString {

	public static void main(String[] args) {
		String name  = "tony bhaskar";
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(10));
		System.out.println(name.contains("tony"));
		System.out.println(name.concat(" puthuru"));
		System.out.println(name.endsWith("bhaskar"));
		System.out.println(name.startsWith("tony"));
		System.out.println(name.length());
		System.out.println(name.hashCode());
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(name.getClass());
		System.out.println(name.replace('a', '@'));
	}

}
