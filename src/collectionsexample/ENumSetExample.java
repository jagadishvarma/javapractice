package collectionsexample;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  }

public class ENumSetExample {

	public static void main(String[] args) {
		
		Set<days> set = EnumSet.of(days.THURSDAY, days.WEDNESDAY);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
