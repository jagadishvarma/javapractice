package collectionsexample;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String []args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("varma");
		ll.add("janu");
		System.out.println(ll);
		
		ll.add(1, "vijju");
		System.out.println(ll);
		
		ll.addFirst("divya");
		ll.addLast("neelu");
		System.out.println(ll);
		
		ll.remove("vijju");
		System.out.println(ll);
	}
}	
