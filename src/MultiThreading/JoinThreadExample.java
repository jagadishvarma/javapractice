package MultiThreading;

//The join() method waits for a thread to die. 
//In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task
public class JoinThreadExample extends Thread {
	
	public void run() {
		for(int i=0; i<=5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		JoinThreadExample jt1 = new JoinThreadExample();
		JoinThreadExample jt2 = new JoinThreadExample();
		JoinThreadExample jt3 = new JoinThreadExample();
		
		jt1.start();
		try {
			jt1.join(1500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		jt2.start();
		jt3.start();
		
	}

}

// 012003114225334455
