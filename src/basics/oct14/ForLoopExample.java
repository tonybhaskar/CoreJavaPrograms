package basics.oct14;

public class ForLoopExample {

	public static void main(String[] args) {
		
		// 1.Printing 1 to 10 using for loop(Simple and general for loop) 
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// 2.Looping through an array 
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+":"+arr[i]);
		}
		
		// 3.We can loop through an array as follow also
		for(int num: arr) {
			System.out.println(num);
		}
		
		// 4.Infinite loop 
		// (if we haven't given any parameters and increment and decrement cases 
		// it will get into an infinite loop)
		
//		for(;;) {
//			System.out.println("code enters an infinite loop");
//			// note: it can be problematic so think once using infinite for loop
//		}
		
		// 5. we can use loop without initializing and giving increment or decrement case
		int i = 1;//Initialization
		for(;i<=10;) {
			System.out.println(i);
			i++; //increment
		}
		
		
		
	}

}