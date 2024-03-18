package exercise;

public class PhoneExecutor {

	public static void main(String[] args) {
		Phone p1 = PhoneFactory.createPhone("Samsung");
		p1.call();
		p1.sms();
		
		 p1 = PhoneFactory.createPhone("Oppo");
		 p1.call();
		 p1.sms();

	}

}
