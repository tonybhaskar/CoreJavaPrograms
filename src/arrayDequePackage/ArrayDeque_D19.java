package arrayDequePackage;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDeque_D19 {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque();
		adq.add(10);
		adq.add(20);
		adq.add(30);
		System.out.println(adq);
		
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		
		adq.addAll(ll);
		adq.addFirst(-10);
		adq.addLast(-20);
		System.out.println(adq);
//		adq.clear();
//		System.out.println(adq);
		
		ArrayDeque adq2 = adq.clone();
		adq.containsAll(adq2);
		System.out.println(adq2);
	}

}
