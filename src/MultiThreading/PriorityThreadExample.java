package MultiThreading;

public class PriorityThreadExample extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		PriorityThreadExample pt1 = new PriorityThreadExample();
		PriorityThreadExample pt2 = new PriorityThreadExample();
		
		pt1.setName("varma");
		pt2.setName("jaggu");
		
		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
	}

}

// jaggu
// varma
