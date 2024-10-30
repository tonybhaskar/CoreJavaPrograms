package patternProgramming2.oct18;



/*
 * 01 06 11 16 21
 * 02 07 12 17 22
 * 03 08 13 18 23
 * 04 09 14 19 24
 * 05 10 15 20 25
 */


import java.util.Scanner;
public class Pattern20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the columns: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<= m; i++) {
			int num = i;
			for(int j = 1; j<=n; j++) {
				if(num < 10)
					System.out.print("0"+num+" ");
				else
					System.out.print(num+" ");
				num+=m;
			}
			System.out.println();
		}
		sc.close();
	}

}
