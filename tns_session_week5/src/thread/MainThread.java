package thread;

public class MainThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		t.start();

	}

}
