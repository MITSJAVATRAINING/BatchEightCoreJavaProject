package multithreadingexamples;

public class RunnableInterfaceExample implements Runnable {

	public void printNumbers() {
		for (int i =1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
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
		RunnableInterfaceExample obj1 = new RunnableInterfaceExample();
		RunnableInterfaceExample obj2 = new RunnableInterfaceExample();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
