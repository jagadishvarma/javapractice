package ExceptionHandling;

// Exception Propagation will work only for unchecked exceptions. it will not work for checked exceptions 

public class PropagationUnChecked {
	
	public void a() {
		try {
			b();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

	private void b() {
		c();
	}
	

	private void c() {
		int a = 100/0;
		
	}

	public static void main(String[] args) {
		PropagationUnChecked puc = new PropagationUnChecked();
		puc.a();

	}

}

// output
// java.lang.ArithmeticException: / by zero

