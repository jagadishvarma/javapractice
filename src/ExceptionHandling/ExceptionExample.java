package ExceptionHandling;

public class ExceptionExample {
	
	public void validate(int m) {
		if(m != 0) {
			throw new ArithmeticException("number not valid");
		}
	}

	public static void main(String[] args) {
		
		try {
			System.out.println("before exception");
			int a = 100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally exception");
		}
		System.out.println("after exception");
		ExceptionExample ee = new ExceptionExample();
		ee.validate(1);
		

	}

}

// output

//before exception
//java.lang.ArithmeticException: / by zero
//finally exception
//after exception

// throw keyword
//Exception in thread "main" java.lang.ArithmeticException: not valid
//at ExceptionHandling.ExceptionExample.validate(ExceptionExample.java:7)
//at ExceptionHandling.ExceptionExample.main(ExceptionExample.java:25)

