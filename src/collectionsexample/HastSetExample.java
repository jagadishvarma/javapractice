package collectionsexample;

import java.util.HashSet;

public class HastSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("neelu");
		hset.add("janu");
		hset.add("manasa");
		
		System.out.println(hset);
		
		hset.remove("manasa");
		System.out.println(hset);
		
	}
}
