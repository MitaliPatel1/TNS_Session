package inheritance;

public class Student  extends Citizen{
	private String UID,CouurseName;

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getCouurseName() {
		return CouurseName;
	}

	public void setCouurseName(String couurseName) {
		CouurseName = couurseName;
	}

	@Override
	public String toString() {
		return "Student [UID=" + UID + ", CouurseName=" + CouurseName + "]";
	}
	
	
	
	

}
