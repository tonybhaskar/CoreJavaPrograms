package patternProgramming3.oct21;

import java.util.Scanner;

public class AlphabetA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j =0; j<n; j++) {
		
				if(i==0 || j==0 || j==(n-1) || i==(n/2)) {
					if(i==0 && j==0 || i==0 && j==(n-1)) {
						System.out.print("  ");
					}else {
						System.out.print("# ");
					}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}