package collectionsexample;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String []args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<Integer> lint = new LinkedList<Integer>();
		
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
		
		lint.add(1);
		lint.add(2);
		lint.add(3);
		lint.add(4);
		lint.add(4);
		System.out.println(lint);
		
		lint.remove(2);
		System.out.println(lint);
		
		lint.remove(Integer.valueOf("2"));
		System.out.println(lint);
		
		lint.removeAll(Arrays.asList(4));
		System.out.println(lint);
	}
}	
