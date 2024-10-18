package patternProgramming2.oct18;

import java.util.Scanner;

/*
* # # # # #
* # # # #
* # # #
* # #
* #
* 
* row col(hash)
* 1	5
* 2	4
* 3	3
* 4	2
* 5	1
*/

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i;j--) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
	}
}
