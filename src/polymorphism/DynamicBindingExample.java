package polymorphism;

//Dynamic binding
//When type of the object is determined at run-time, it is known as dynamic binding.
//Overriding is a perfect example of dynamic binding

public class DynamicBindingExample extends Animal {
	
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String[] args) {

		Animal dog = new DynamicBindingExample();
		dog.eat();

	}

}

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

//Output:dog is eating...
//In the above example object type cannot be determined by the compiler, because the instance of Dog is also an instance of Animal.So compiler doesn't know its type, only its base type.