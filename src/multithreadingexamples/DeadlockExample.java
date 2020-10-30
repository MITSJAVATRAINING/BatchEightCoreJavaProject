package multithreadingexamples;

public class DeadlockExample {

	public static void main(String args[]) {
		String resource1 = "printer1";
		String resource2 = "printer2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("thread 1 occupied resource 1");
				}
				
				synchronized (resource2) {
					System.out.println("thread 1 occupied resource 2");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("thread 2 occupied resource 2");
				}
				
				synchronized (resource1) {
					System.out.println("thread 2 occupied resource 1");
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
