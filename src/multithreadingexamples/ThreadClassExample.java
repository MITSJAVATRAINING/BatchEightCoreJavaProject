package multithreadingexamples;

public class ThreadClassExample extends Thread {
	
	public void printNumbers() {
		for (int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + " " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		printNumbers();
	}

	public static void main(String args[]) {
		ThreadClassExample t1 = new ThreadClassExample();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadClassExample t2 = new ThreadClassExample();
		t2.start();
		ThreadClassExample t3 = new ThreadClassExample();
		t3.start();
	}
}
