package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("------ staring main thread --------"+Thread.currentThread().getName());
		//Operation.OddEven(16);
		//System.out.println("Is  7 prime number  ? "+Operation.checkPrime(7));

		// multi threading  
		// creating child thread
		//ChildThread c = new ChildThread();
		//c.start(); // start execution internally calls run() method
		
		// mythread 
		
		/*MyThread m = new MyThread();// thread-0
		MyThread m1 = new MyThread();//thread-1
		m.start();
		m1.start();
		//m.run();// convert application into simple 
		//m1.run();*/
		
		// using runnable interface
		ChildThreadOne c1 = new ChildThreadOne();
		Thread t1 = new Thread(c1);
		
		
		ChildThreadTwo c2 = new ChildThreadTwo();
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		
		System.out.println("------ end of  main thread --------"+Thread.currentThread().getName());
	}

}
