package polymorphism;

public class MethodOverRiddingExample {
	
	public static void main(String []args) {
		B bclass = new B();
		bclass.eat();
	}
}

class A {
	void eat() {
		System.out.println("A eating");
	}
}

class B extends A {
	void eat() {
		System.out.println("B eating");
	}
}
