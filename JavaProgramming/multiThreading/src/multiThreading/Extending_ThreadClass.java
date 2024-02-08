package multiThreading;

public class Extending_ThreadClass {
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i < n; i++) {
			ThreadExample object = new ThreadExample();
			object.start();
		}
	}
}

class ThreadExample extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {

			System.out.println("Exception is caught");
		}
	}
}