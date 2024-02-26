//find the biggest number using switch case

package javacourse;

public class Swichcase {
	public static void main(String[] args) {
		int a=10;
		int b=15;
	    int larg = a>b?1:0; 
	    
		
		//int res = (a>b)?a:b; // Turner operator
		switch(larg){
		case 1 : 
			
			System.out.println(" maximum value is : "+a);
			break;
			
		case 0 :
			System.out.println(" maximum value is : "+b);
			break;
		
		}
	}

}
