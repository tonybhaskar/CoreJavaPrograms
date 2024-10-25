package patternProgramming4.oct22;

import java.util.Scanner;

public class TonyName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			
			//T
			for(int j = 0; j<n; j++) {
				if( i==0 || j==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//O
			for(int j = 0; j<n; j++) {
				if((i==0 || i==(n-1)) && j!=0 && j!=(n-1) || (j==0 || j==(n-1)) && i!=0 && i!=(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for N
			for(int j = 0; j<n; j++) {
				if(j==0 || j==(n-1) || i==j ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for Y
			for(int j = 0; j<n; j++) {
				if( i==j && i<=(n/2) || i+j == n-1 && i<=(n/2) || j==n/2 && i>=n/2 ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			
			System.out.print("  ");
			
			
			//B
			for(int j = 0; j<n; j++) {
				if( ((i==0 || i==(n-1) || (i==(n/2))) && j!=(n-1)) || (j==(n-1) && i!=0 && i!=(n-1) && i!=(n/2)) || j==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for H
			for(int j = 0; j<n; j++) {
				if(j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			// A
			for(int j = 0; j<n; j++) {
				if(i==0 && j!=0 && j!=(n-1) || j==0 && i!=0 || j==(n-1)&& i!=0 || i==(n/2)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for S
			for(int j = 0; j<n; j++) {
				if( i==0 && j!=0 || i==(n-1) && j!=(n-1) || j==0 && i!=0 && i<(n/2)
						|| i==(n/2) && j!=0 && j!=n-1 || j==(n-1) && i!=n/2 && i>n/2 &&i<(n-1) ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for K
			for(int j = 0; j<=n/2; j++) {
				if(j==0 || i+j ==(n/2) || i-j == (n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}

			
			System.out.print("  ");
			// A
			for(int j = 0; j<n; j++) {
				if(i==0 && j!=0 && j!=(n-1) || j==0 && i!=0 || j==(n-1)&& i!=0 || i==(n/2)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			//for R
			for(int j = 0; j<n; j++) {
				if( j==0 || i==0 && j<=(n/2) || j==(n/2) && i<=n/2 || i==(n/2) && j<=(n/2) || i-j == (n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.println();
		}
	}

}
