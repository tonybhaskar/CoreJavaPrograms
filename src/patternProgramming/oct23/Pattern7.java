package patternProgramming.oct23;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		for(int i =0; i<n ;i++) {
			for(int j = 0; j<n; j++) {
				if(i==0 || j==0 || i==(n-1) || j== (n-1)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			
			for(int j = (n/2)+1; j<n; j++) {
				if(j-i == (n/2) || i+j == (n-1)+(n/2)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}

			System.out.println();
		} 
		
	}

}
