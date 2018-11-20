package collectionsexample;

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(5, "b");
		tm.put(2, "f");
		tm.put(3, "d");
		System.out.println(tm);
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey());
		}
		
		tm.remove(3);
		System.out.println(tm);

	}

}
