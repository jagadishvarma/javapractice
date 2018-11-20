package Abstraction;

public class MultipleInhertienceExample implements Printable, Showable{
	
	public void print() {
		System.out.println("printing");
	}
	
	public static void main(String[] args) {
		
		Showable sh = new MultipleInhertienceExample();
		sh.print();
	}

}

interface Printable{
	void print();
}

interface Showable {
	void print();
} 