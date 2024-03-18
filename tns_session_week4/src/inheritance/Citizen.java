package inheritance;

public class Citizen {
	private String name ,aadharNo,email;

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

	public String display() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", email=" + email + "]";
	}
	
	

}
