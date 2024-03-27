package exception_example;

public class Finallyblock {
	public static void main(String[] args) {
		
		  int a,b;
		  a=12;
		  b=0;
		  try {
		  System.out.println(a/b);
		  }
		  catch(Exception e) {
			  System.out.println("you can not divide any number "+e.getMessage() + " please enter bigger than zero");
		  }
		  finally {
			System.out.println("finally block...... ");
		}
		  System.out.println("statement after finally block");
			}
	

}
