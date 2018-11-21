package exceptionmethodoverridding;

//If the superclass method declares an exception, subclass overridden method can declare same,
//subclass exception or no exception but cannot declare parent exception.
public class ExceptionMOPArent extends Parent {

	void run() throws ArithmeticException{
		System.out.println("child");
	}
	public static void main(String[] args) {
		
		Parent p = new ExceptionMOPArent();
		try {
			p.run();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}


class Parent{
	void run() throws Exception{
		System.out.println("parent");
	}
}

// child