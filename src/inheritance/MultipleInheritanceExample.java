package inheritance;

public class MultipleInheritanceExample {
	
	public static void main(String []args) {
		C classc = new C();
		classc.weep();
		classc.bark();
		classc.eat();
	}
}

class A{
	void eat() {
		System.out.println("eating");
	}
}

class B extends A{
	void bark() {
		System.out.println("barking");
	}
}

class C extends B {
	void weep() {
		System.out.println("weeping");
	}
}
