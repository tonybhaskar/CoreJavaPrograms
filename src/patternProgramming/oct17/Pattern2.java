package patternProgramming.oct17;
import java.util.Scanner;

/*
 *#
 *#
 *#
 *# 
 */
public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter the size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("#");
		}
	}

}
