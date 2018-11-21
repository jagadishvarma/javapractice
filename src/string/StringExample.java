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
		
		// concat method
		String s6 = s2.concat(s3);
		System.out.println(s6); // janujanu
		
		// substring
		String s7 = "VarmaAlluri";
		String s8 = s7.substring(2);
		String s9 = s7.substring(2, 6);
		System.out.println(s8); // rmaAlluri
		System.out.println(s9); // rmaA
		
		// lowercase and uppsercase
		System.out.println(s7.toLowerCase()); // varmaalluri
		System.out.println(s7.toUpperCase()); // VARMAALLURI
		
		// trim
		String s10 = " varma alluri ";
		System.out.println(s10.trim()); // varma alluri (eliminates white spaces before and after string ) 
	
		// startswith and endswith
		boolean d = s7.startsWith("Va");
		System.out.println(d); // true
		boolean e = s7.endsWith("ri");
		System.out.println(e); // true
		
		// charAt
		System.out.println(s7.charAt(1)); // a 
		
		// lengh
		System.out.println(s7.length()); // 11
		
		// intern
		String s11 = s7.intern();
		System.out.println(s11); // VarmaAlluri 
		
		// valueOf
		int i = 10;
		String s12 = String.valueOf(i);
		System.out.println(s12+10);  // 1010
		
		// replace
		String s13 = "this is Jagadish varma";
		String s14 = s13.replace("varma", "alluri");
		System.out.println(s14); // this is Jagadish alluri
		
	}

}
