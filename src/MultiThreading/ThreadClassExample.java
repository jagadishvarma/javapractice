package MultiThreading;

public class ThreadClassExample extends Thread {

	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		ThreadClassExample t1 = new ThreadClassExample();
		t1.start();
	}

}

// Running