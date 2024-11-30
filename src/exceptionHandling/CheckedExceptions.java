package exceptionHandling;

public class CheckedExceptions {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("exceptionHandling.ExistedClass");
		System.out.println("class found bro");

	}

}
