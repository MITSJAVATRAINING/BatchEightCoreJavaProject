package multithreadingexamples;

class  Table {
	
	synchronized void printTable(int n) {
		for (int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;
	MyThread1(Table t){
		this.t = t;
	}
	
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	
	public void run() {
		t.printTable(100);
	}

}

public class TableSyncronization {

	public static void main(String args[]) {
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
