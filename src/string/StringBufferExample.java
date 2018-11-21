package string;

import java.lang.StringBuffer;
public class StringBufferExample {

	public static void main(String[] args) {
		
		// we use StringBuffer for mutable String
		
		// append
		StringBuffer sb = new StringBuffer();
		sb.append("alluri");
		System.out.println(sb); // alluri
		
		// insert
		sb.insert(2, "jaggu"); 
		System.out.println(sb); // aljagguluri
		
		// replace
		StringBuffer sb1 = new StringBuffer("varma");
		sb1.replace(2, 4, "jaggu");
		System.out.println(sb1); // vajaggua
		
		// delete
		sb1.delete(2, 4);
		System.out.println(sb1); // vaggua
		
		sb1.reverse();
		System.out.println(sb1); // auggav
		
		// capacity
		//The capacity() method of StringBuffer class returns the current capacity of the buffer.
		//The default capacity of the buffer is 16. If the number of character increases from its current capacity, 
		//it increases the capacity by (oldcapacity*2)+2.
		//For example if your current capacity is 16, it will be (16*2)+2=34.
		
		System.out.println(sb1.capacity()); // 21
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity()); // 16
		sb2.append("this is jagadish varma alluri");
		System.out.println(sb2.capacity()); // 34   (16*2)+2=34)
	}

}
