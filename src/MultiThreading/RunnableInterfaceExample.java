package MultiThreading;

public class RunnableInterfaceExample implements Runnable{

	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		RunnableInterfaceExample ri = new RunnableInterfaceExample();
		Thread t1 = new Thread(ri);
		t1.start();

	}
}

//Running