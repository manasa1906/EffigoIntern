package multiThreading;

public class threadPriorities extends Thread {
	public void run() {

		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		threadPriorities t1 = new threadPriorities();
		threadPriorities t2 = new threadPriorities();
		threadPriorities t3 = new threadPriorities();

		System.out.println("t1 thread priority : " + t1.getPriority());

		System.out.println("t2 thread priority : " + t2.getPriority());

		System.out.println("t3 thread priority : " + t3.getPriority());

		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		System.out.println("t1 thread priority : " + t1.getPriority());

		System.out.println("t2 thread priority : " + t2.getPriority());

		System.out.println("t3 thread priority : " + t3.getPriority());
		System.out.println("Currently Executing Thread : " + Thread.currentThread().getName());

		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(10);

		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
	}
}
