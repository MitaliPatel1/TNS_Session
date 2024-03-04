package week2;

import java.util.Scanner;

public class Personmain {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :" );
		String n=sc.next();
		
		System.out.println("Enter age :" );
		int a = sc.nextInt();
		
		System.out.println("Enter emailid :");
		String e = sc.next();
		
		System.out.println("Enter income :");
		double i = sc.nextDouble();
		
		Person p = new Person();
	
		p.setName(n);
		p.setAge(a);
		p.setEmail(e);
		p.setIncome(i);
		
		System.out.println(p.toString());
		p.vote();
		TaxCalculation tx= new TaxCalculation();
	    tx.tax_calculation(p);
	}
	
	

}
