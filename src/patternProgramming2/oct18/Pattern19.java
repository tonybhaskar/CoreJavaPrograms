package patternProgramming2.oct18;

import java.util.Scanner;

/*
 * 01 02 03 04 05
 * 06 07 08 09 10
 * 11 12 13 14 15 
 * 16 17 18 19 20
 * 21 22 23 24 25
 */

public class Pattern19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int count = 1;
		
		for(int i =1; i<=n ; i++) {
			for(int j = 1; j<=n; j++) {
				if(count / 10 == 0)
					System.out.print("0"+count++ +"	");
				else
					System.out.print(count++ +"	");
			}
			System.out.println();
		}
	}
}
