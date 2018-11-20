package Abstraction;

public class InterfaceExample {

	public static void main(String[] args) {
		Bank bank = new SBI();
		System.out.println(bank.bankOfInterest());

	}

}

interface Bank {
	
	float bankOfInterest();
}

class SBI implements Bank {
	public float bankOfInterest() {
		return 9.3f;
	}
}

class Kotak implements Bank {
	public float bankOfInterest() {
		return 9.5f;
	}
}
