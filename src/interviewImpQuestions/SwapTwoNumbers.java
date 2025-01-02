package interviewImpQuestions;

public class SwapTwoNumbers {
	
	public static void swapNumbers(int first, int second) {
		first = first ^ second; // 10 + 15 = 25
		second = first ^ second; // 25 - 15 = 10 (prev first value)
		first = first ^ second; // 25 - 10 = 15 (prev second value)
		
		System.out.println("first: "+ first+ ", second: "+second);
	}

	public static void main(String[] args) {
		swapNumbers(10, 15);
	}

}
