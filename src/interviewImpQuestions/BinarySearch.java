package interviewImpQuestions;

public class BinarySearch {
	
	public static void binarySearch(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		boolean found = false;
		
		while(low <= high) {
			int mid = low + (high - low)/2; 
			if(arr[mid] == target) {
//				System.out.println("target found at: "+mid);
				found = true;
			}
			if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid-1;
			}
		}
		if(found == true) {
			System.out.println("target found in the array");
		}else {
			System.out.println("target not found in the array");
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		binarySearch(arr, 0);
	}

}
