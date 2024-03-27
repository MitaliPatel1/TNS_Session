package thread;

public class ChildThreadOne  implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hii");
		}
	}
	

}
