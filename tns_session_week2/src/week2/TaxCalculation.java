package week2;

public class TaxCalculation {

	public void tax_calculation(Person p) {
		
	/*	if(p.getAge() > 50 && p.getIncome() >=50000) {
			System.out.println("need to pay tax.....");
			
		}
		else {
			System.out.println("no need to pay tax.....");
		} */
		double tax;
		
		if(p.getAge() >18 && p.getIncome()>=50000 && p.getIncome()<80000) {
			tax=p.getIncome()*0.1;
		}
		else if(p.getAge() >18 && p.getIncome()>=80000 && p.getIncome()<=100000) {
			tax=p.getIncome()*0.2;
		}
		else {
			tax=0;
		}
		System.out.println("tax : "+tax);
	}

}
