package ExceptionHandling;

import java.io.IOException;

public class PropagationChecked {

	public static void main(String[] args) {
		
		PropagationChecked pc = new PropagationChecked();
		pc.a();

	}

	private void a() {
		try {
			b();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

	private void b() throws IOException {
		c();
		
	}

	private void c() throws IOException {
		throw new IOException("not valid");
		
	}

}


// java.io.IOException: not valid