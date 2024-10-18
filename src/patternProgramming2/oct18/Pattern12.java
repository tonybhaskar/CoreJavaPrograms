package patternProgramming2.oct18;

import java.util.Scanner;

/*
 * 1 1 1 1 1 1 2 3 4 5
 * 2 2 2 2 2 1 2 3 4 5
 * 3 3 3 3 3 1 2 3 4 5
 * 4 4 4 4 4 1 2 3 4 5
 * 5 5 5 5 5 1 2 3 4 5
 */

public class Pattern12 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size: ");
			int n = sc.nextInt();
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n;j++) {
					System.out.print(i+" ");
				}
				for(int j=1; j<=n;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		
	}
}
