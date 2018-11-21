package string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("this is jagadish varma alluri");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
