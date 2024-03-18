package assignment;

import java.util.Scanner;

public class Mainsb {

	public static void main(String[] args) {
		
		int c;
		System.out.println("* * * * *");
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter your  amount : ");
		long a = sc.nextLong();
		SavingAccount sa = new SavingAccount(a);
		
		System.out.println("enter your choice : \n 1 : withdraw \n 2 : deposite \n 3 : exit");
		do {
		System.out.println("enter your choice...");
		c= sc.nextInt();
		if(c ==1) {
		System.out.println("Enter withdraw amount : ");
	    long wd =  sc.nextLong();
		sa.withdrawamount(wd);
		}
		else if(c == 2) {
		System.out.println("Enter deposite amount : ");
		long da = sc.nextLong();
		sa.depositeamount(da);
		}
		
		}while(c!=3);
		System.out.println("you are exited ");
		System.out.println("* * * * *");
	}

}
