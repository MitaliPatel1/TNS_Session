package exercise;

public class Employee  extends Citizen1{
	   String designation;

	public Employee(String name ,String email,String aadharNo, String designation ) {
		super(name,email,aadharNo);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	


	   
	   
	}
