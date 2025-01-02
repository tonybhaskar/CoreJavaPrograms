package interviewImpQuestions;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int n = 7;
		
		int expectedSum = n * (n+1)/2;
		int actualSum = 0;
		for(int num : arr) {
			actualSum += num;
		}
		
		if((expectedSum - actualSum) == 0) {
			System.out.println("in this array all numbers are there");
		}else System.out.println("The missing number is: "+(expectedSum - actualSum));
	}

}
