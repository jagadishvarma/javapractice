package polymorphism;

public class MethodOverLoadingExample {
	
	void add(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	
	void add(int a, int b,int c) {
		int d= a+b+c;
		System.out.println(d);
	}
	
	
	void add(double a, double b) {
		double d= a+b;
		System.out.println("double " + d);
	}

	public static void main(String[] args) {
		
		MethodOverLoadingExample ml = new MethodOverLoadingExample();
		ml.add(1,2,3); // 6 
		ml.add(1,2);   // 3
		ml.add(2.3,3); // double 5.3
	}
	
}
