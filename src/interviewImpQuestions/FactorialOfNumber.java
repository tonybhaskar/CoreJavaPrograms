package interviewImpQuestions;

public class FactorialOfNumber {
	
	public static double getFactorial(int num) {
		double fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(FactorialOfNumber.getFactorial(100));
	}

}
