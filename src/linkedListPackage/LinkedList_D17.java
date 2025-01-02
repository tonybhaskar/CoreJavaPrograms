package linkedListPackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_D17 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(ll);
		ll.add(5, -5);
		System.out.println(ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println(ll);
		
		ArrayList al = new ArrayList();
		al.add("java");
		al.add("python");
		al.add("sql");
		al.add("html/css");
		System.out.println(al);
		
//		ll.add(al);
		ll.addAll(al);
//		ll.add(0, al);
//		ll.addAll(1, al);
		System.out.println(ll);
		
//		ll.clear();
//		System.out.println(ll);
//		System.out.println(ll.clone());
		LinkedList clonedList =(LinkedList) ll.clone();
		System.out.println(clonedList);
		System.out.println(ll == clonedList);
		System.out.println(ll.contains("java"));
		ll.add("javascript");
		System.out.println(ll);
		
		clonedList.add("ruby");
		System.out.println(ll.containsAll(clonedList));
		
		System.out.println(clonedList);
		clonedList.push("react.js");
		System.out.println(clonedList);
		System.out.println(clonedList.pop());
	}

}





























































