package collectionsexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "varma");
		hm.put(2, "manu");
		hm.put(3, "neelu");
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+ "  "+ m.getValue());
		}
		
		hm.remove(2);
		System.out.println(hm);
		
		hm.remove(1, "varma");
		System.out.println(hm);
		
		hm.replace(3, "priya");
		System.out.println(hm);
	}

}
