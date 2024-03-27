package exercise;

public class NumberValidator {
	public static void chechEvenNumber(int number) throws IllegalAccessException {
		if(number % 2 !=0) {
			throw new IllegalAccessException(number + " is odd.");
		}
	}

}
