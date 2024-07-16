package multiThreading;

public class deamonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		deamonThread t1 = new deamonThread();
		deamonThread t2 = new deamonThread();
		deamonThread t3 = new deamonThread();

		t1.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();
	}

}
