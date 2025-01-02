package interviewImpQuestions;

public class FibonacciSeries {
	
	public static int getFibonacciNumber(int n) {
		int first = 0,  second = 1;
		int temp = 0;
		for(int i = 2; i<=n; i++) {
			temp = first + second;
			first = second;
			second = temp;
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(FibonacciSeries.getFibonacciNumber(10));
	}
	
}
