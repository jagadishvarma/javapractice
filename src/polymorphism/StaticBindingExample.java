package polymorphism;

//Connecting a method call to the method body is known as binding.

public class StaticBindingExample {
	
	private void eat() {
		System.out.println("eating...");
	}

	public static void main(String[] args) {

		//static binding
		//When type of the object is determined at compiled time(by the compiler), it is known as static binding.
		//If there is any private, final or static method in a class, there is static binding.
		
		StaticBindingExample be = new StaticBindingExample();
		be.eat();
		
		
	}

}
