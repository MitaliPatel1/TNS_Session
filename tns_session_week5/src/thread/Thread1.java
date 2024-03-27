package thread;

public class Thread1  extends Thread{
	@Override
	public void run() {
	int n=2;
	for(int i=1;i<=10;i++) {
		System.out.println(n+ "*" + i + "=" + n*i);
		
	}
	}

}
