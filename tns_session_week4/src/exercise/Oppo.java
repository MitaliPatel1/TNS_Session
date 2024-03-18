package exercise;

public class Oppo  implements Phone{
	@Override
	public void call() {
		System.out.println("calling using Oppo");
		
	}
	@Override
	public void sms() {
		System.out.println("Messaging using Oppo");
	}

}
