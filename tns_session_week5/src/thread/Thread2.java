package thread;

public class Thread2  implements Runnable{

	@Override
	public void run() {
		int n=3;
		for(int i=1;i<=10;i++) {
			System.out.println(n+ "*" + i + "=" + n*i);
			
		}

		
	}

}
