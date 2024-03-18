package has_a_relationship;

public class Address {
	String streername,area;
	int pincode;
	public String getStreername() {
		return streername;
	}
	public void setStreername(String streername) {
		this.streername = streername;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [streername=" + streername + ", area=" + area + ", pincode=" + pincode + "]";
	}
	
	

}
