package thread;

public class ChildThread  extends Thread{
	public void run() {
		System.out.println("Is  7 prime number  ? "+Operation.checkPrime(7));

	}

}
