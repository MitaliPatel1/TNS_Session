package javacourse;

public class Biggernumber {
	public static void main(String[] args) {
		int x=10;
		int y=12;
		int z=32;
		if(x>=y && x>=z) {
			System.out.println(x + " is the largest number");
		}
		else if(y>=x && y>=z) { 
			System.out.println(y + " is the largest number");
			
		}
		else {
			System.out.println(z+ " is the largest number");
		}
	}

}
