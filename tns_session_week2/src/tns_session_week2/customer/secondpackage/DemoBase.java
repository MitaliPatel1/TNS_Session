package tns_session_week2.customer.secondpackage;

import tns_session_week2.employee.firstpackage.Base;

public class DemoBase extends Base{

	public static void main(String[] args) {
		Base b = new Base();
		
		// b.setDefaultvar(0);//  default  is not access
		//System.out.println(b.getDefaultvar()); 
		
		DemoBase db =new DemoBase();
		System.out.println(db.getProtectedvar());
		 

	}

}
