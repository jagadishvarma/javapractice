package collectionsexample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(5);
		ts.add(4);
		ts.add(2);
		ts.add(3);
		
		System.out.println(ts);
		
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<Integer> dit = ts.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
	}

}
