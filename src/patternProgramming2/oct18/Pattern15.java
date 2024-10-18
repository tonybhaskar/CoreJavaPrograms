package patternProgramming2.oct18;

import java.util.Scanner;

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

public class Pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
