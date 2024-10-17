package patternProgramming.oct17;
import java.util.Scanner;

/*
 * row hash
 *  1    5
 *  2    5
 *  3    5
 *  4    5
 *  5    5
 *  
 *  21 22 23 24 25
 *  *
 *  *
 *  *
 *  1 2 3 4 5 
 */

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int count = n*n;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(count+"	");
				count--;
			}
			System.out.println();
		}
	}

}
