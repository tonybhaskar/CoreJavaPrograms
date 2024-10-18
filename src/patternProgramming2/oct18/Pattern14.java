package patternProgramming2.oct18;

import java.util.Scanner;

/*
 * #
 * # #
 * # # #
 * # # # #
 * # # # # #
 * 
 * row col(hash)
 * 1	1
 * 2	2
 * 3	3
 * 4	4
 * 5	5
 */

public class Pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
	}
}
