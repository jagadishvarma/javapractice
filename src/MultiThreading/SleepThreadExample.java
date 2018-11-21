package MultiThreading;

//As you know well that at a time only one thread is executed. 
//If you sleep a thread for the specified time,the thread shedular picks up another thread and so on
public class SleepThreadExample extends Thread {
	
	public void run() {
		for (int i=0; i< 5; i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.print(e);
			}
			System.out.print(i); 
		}
	}
	public static void main(String[] args) {
		SleepThreadExample st1 = new SleepThreadExample();
		SleepThreadExample st2 = new SleepThreadExample();
		SleepThreadExample st3 = new SleepThreadExample();
		
		st1.start();
		st2.start();
		st3.start();

	}

}

// 000111222333444