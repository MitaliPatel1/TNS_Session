package exercise;

public class OddNumber {
	public static void tryNumber(int n) {
		
		try {
			NumberValidator.chechEvenNumber(n);
			System.out.println(n + " is even.");
			
		}
		catch(IllegalAccessException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
