package basics.oct14;

public class Main {

	public static void main(String[] args) {
		
		byte a = 5;
		byte b = a++;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		System.out.println("=================");
		
		byte c = 5;
		byte d = ++c;
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		System.out.println("=================");
		
		int e = 20;
		int f = e++ + e++;
		System.out.println("e: "+e);
		System.out.println("f: "+f);
		
		System.out.println("=================");
		
		int g = 20;
		int h = g++ + g++;
		System.out.println("g: "+g);
		System.out.println("h: "+h);
		
		System.out.println("=================");
		
		int i = 89;
		int j = i++ + i++ + ++i + i++ + ++i + i++ + ++i - i--;
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		
		System.out.println("=================");
		
		int k = 177;
		int l = --k + k-- + k++ + k-- - --k - k-- - --k + k++ + --k - k-- + --k + ++k + ++k + k++ ;
		System.out.println("k: "+k);
		System.out.println("l: "+l);
		
	}

}
