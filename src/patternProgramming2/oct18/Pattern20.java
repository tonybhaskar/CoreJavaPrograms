package patternProgramming2.oct18;

import java.util.Scanner;

/*
 * 01 06 11 16 21
 * 02 07 12 17 22
 * 03 08 13 18 23
 * 04 09 14 19 24
 * 05 10 15 20 25
 */

public class Pattern20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			int num = i;
			for(int j = 1; j<=n; j++) {
				if(num / 10 == 0)
					System.out.print("0"+num+" ");
				else
					System.out.print(num+" ");
				num+=n;
			}
			System.out.println();
		}
		sc.close();
	}

}
