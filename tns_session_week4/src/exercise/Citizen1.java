package exercise;

public class Citizen1 {
	 String name ,aadharNo,email;
	

	public Citizen1(String name, String email,String aadharNo) {
	
		this.name = name;
		this.aadharNo = aadharNo;
		this.email = email;
	}
	
	



	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getAadharNo() {
		return aadharNo;
	}





	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", email=" + email + "]";
	}

	

	
	
	

}
