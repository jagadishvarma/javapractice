package ExceptionHandling;

public class CustomExceptionEample {

	public static void main(String[] args) {
		CustomExceptionEample ce = new CustomExceptionEample();	
		try {
			ce.validate(10);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	private void validate(int i) throws AgeInvalidExcption {
		if(i > 0) {
			throw new AgeInvalidExcption("not valid");
		}
		
	}

}

// ExceptionHandling.AgeInvalidExcption: not valid