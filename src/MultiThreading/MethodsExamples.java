package MultiThreading;

public class MethodsExamples extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName()); // Thread-1 0r Thread-2 etc
	}
	
	public static void main(String[] args) {
		MethodsExamples me1 = new MethodsExamples();
		MethodsExamples me2 = new MethodsExamples();
		MethodsExamples me3 = new MethodsExamples();
		
		System.out.println(me1.getName()); // Thread-0
		System.out.println(me2.getName()); // Thread-1
		System.out.println(me3.getName()); // Thread-2
		
		me1.start();
		me2.start();
		me3.start();
		
		me1.setName("varma");
		System.out.println(me1.getName());  // varma

	}

}


