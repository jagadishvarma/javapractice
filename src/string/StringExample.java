package string;

public class StringExample {

	public static void main(String[] args) {
		
		char[] ch = {'j','a','g','g','u'};
		String s = new String(ch);
		System.out.println(s); // jaggu
		
		String s1 = "varma";
		s1.concat("alluri");
		System.out.println(s1); // varma because String is immutable
		
		//compare
		
		//by equals method
		String s2 = "janu";
		String s3 = "janu";
		boolean a = s2.equals(s3);
		System.out.println(a); //true checks content
		
		//by == Operator
		String s4 = new String("janu");
		boolean b = (s2==s4);
		System.out.println(b); // false checks reference
		
		//by compareTO method compares lexographically
		int c = s2.compareTo(s3);
		System.out.println(c); // 0
		
		//String Concatenation
		
		//by + sign
		String s5 = "jaggu" + " alluri";
		System.out.println(s5); // jaggu alluri
		
		//by concat method
		
		String s6 = s2.concat(s3);
		System.out.println(s6); // janujanu

	}

}
