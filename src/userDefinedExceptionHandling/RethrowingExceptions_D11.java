package userDefinedExceptionHandling;

import java.util.Scanner;

class Operation_1{
	void function1() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Divsion operation started");
		System.out.print("Enter number - a: ");
		int a = sc.nextInt(); // critical statement - InputMisMatchException

		System.out.print("Enter number - b: ");
		int b = sc.nextInt(); // critical statement - InputMisMatchException

		int c = a / b; // critical statement - ArithmeticException
		System.out.println(c);
		System.out.println("Divsion operation is completed");
		sc.close();
	}
}

class Operation_2{
	void function2() throws Exception{
		try {
			Operation_1 op1 = new Operation_1();
			op1.function1();
		} catch (Exception e) {
			throw e; // re-throwing of exception
		}
	}
}

class Operation_3{
	void function3() throws Exception{
		Operation_2 op2 = new Operation_2();
		op2.function2();
	}
}

class Operation_4{
	void function4() throws Exception{
		Operation_3 op3 = new Operation_3();
		op3.function3();
	}
}

public class RethrowingExceptions_D11 {

	public static void main(String[] args) throws Exception{
		try {
			Operation_4 op4 = new Operation_4();
			op4.function4();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
