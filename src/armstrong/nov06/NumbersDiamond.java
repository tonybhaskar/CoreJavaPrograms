package armstrong.nov06;

import java.util.Scanner;

/*
 *         1
 *       2 3 4 
 *     5 6 7 8 9
 *   1 2 3 4 5 6 7
 * 8 9 1 2 3 4 5 6 7
 */
public class NumbersDiamond {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no of rows: ");
    	int rows = sc.nextInt();
    	
    	System.out.println("Enter the max number: ");
    	int n = sc.nextInt(); // here in pattern n = 9
    	int temp = 1;
    	
    	// outer for-loop is to loop "rows" times
    	for(int i=1; i<=rows; i++) {
    		
    		//to print the spaces 
    		for(int j = rows-i; j>=1 ;j--) {
    			System.out.print("	");
    		}
    		
    		// to print numbers it here we are printing numbers odd times starting from 1
    		// so start from 1 
    		for(int k = 1; k <= i*2 - 1; k++ ) {
    			if(temp > n) {
    				temp = 1;
    			}
    			System.out.print(temp);
    			System.out.print("	");
    			temp+= 1;
    			
    		}
    		System.out.println();
    		
    	}
    	
    }
}
