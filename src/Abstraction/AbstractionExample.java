package Abstraction;

class AbstractionExample extends Bike {
	void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
	
		Bike b = new AbstractionExample();
		b.run();
	}

}

abstract class Bike {
	abstract void run();
} 