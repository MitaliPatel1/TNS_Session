package arrays;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		for(int i=0;i<e.length;i++) {
			e[i]=new Employee();
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<e.length;i++) {
			int j = i+1;
			
			e[i]=new Employee();
			e[i].setUID(j);
			System.out.println("Enter name :");
			String name = sc.nextLine();
			e[i].setName(name);
			
		}
		for(int i=0;i<e.length;i++) {
			
			System.out.println("UID : "+ e[i].getUID() + " name  : "+e[i].getName());
		}
		
		

	}

}
