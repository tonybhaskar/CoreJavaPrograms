package patternProgramming.oct23;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		for(int i =0; i<n ;i++) {
			for(int j = 0; j<n/2; j++) {
				if(i+j == (n/2) || i-j == (n/2)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
	}

}
