package exception_example;



public class PercantageValidator {
	public static void isValidPercentage(float per) throws ArithmeticException{
		if(per >=0 && per<=100) {
			System.out.println("valid percentage : "+per);
		}
		else {
			System.out.println("please enter valid percentage ");
		}
	}

}
