package patternProgramming2.oct18;

import java.util.Scanner;

/*
 * 1	2	3	4	5	6	7	8	9	10	
 * 11	12	13	14	15	16	17	18	19	20
 * 21	22	23	24	25	26	27	28	29	30
 * 31	32	33	34	35	36	37	38	39	40
 * 41	42	43	44	45	46	47	48	49	50	
*/

public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int count = 1;
		
		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n;j++) {
//				System.out.print("# ");
//			}
//			for(int j=1; j<=n;j++) {
//				System.out.print("$ ");
//			}
			
			for(int j=1; j<=2*n;j++) {
				System.out.print(count+ "	");
				count++;
			}
			
			System.out.println();
			
		}
		
	}
}
