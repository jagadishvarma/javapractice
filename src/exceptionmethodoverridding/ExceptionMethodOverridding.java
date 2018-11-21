package exceptionmethodoverridding;

// If the superclass method does not declare an exception, 
//subclass overridden method cannot declare the checked exception but can declare unchecked exception.
public class ExceptionMethodOverridding extends A {

	void msg() throws ArithmeticException {
		System.out.println("emo msg");
	}
	
	public static void main(String[] args) {
		A obj = new ExceptionMethodOverridding();
		obj.msg(); 

	}

}

class A  {
	void msg() {
		System.out.println("a msg");
	}
}


// emo msg