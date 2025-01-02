package interviewImpQuestions;


public class CheckPrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		if(num < 2) return false;
		for(int i = 2; i < Math.sqrt(num); i++) {
			if( num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(CheckPrimeNumber.isPrimeNumber(20));
	}
}
