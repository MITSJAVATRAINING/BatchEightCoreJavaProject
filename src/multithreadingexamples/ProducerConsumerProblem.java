package multithreadingexamples;

class Q {
	
	int num;
	boolean valueSet = false;
	public synchronized void put(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("value put " + num);
		this.valueSet = true;
		notify();
	}
	
	public synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("value get " + num);
		this.valueSet = false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	
	Producer(Q q) {
		this.q = q;
	}
	
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	Q q;
	
	Consumer(Q q) {
		this.q = q;
	}
	
	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerProblem {

	public static void main(String args[]) {
		Q q = new Q();
		Thread producerThread = new Thread(new Producer(q));
		Thread consumerThread = new Thread(new Consumer(q));
		producerThread.start();
		consumerThread.start();
	}
}
