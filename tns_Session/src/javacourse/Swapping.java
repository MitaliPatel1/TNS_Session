//1.Swapping the two numbers without using third variable.

package javacourse;

public class Swapping {
	public static void main(String [] args) {
		int x = 34;
		int y=89;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x :"+x);
		System.out.println("value of y :"+y);
	}

}
