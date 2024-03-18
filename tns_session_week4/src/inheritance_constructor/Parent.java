package inheritance_constructor;

public class Parent {
	
	private int UID;
	
	public Parent() {
		UID=0;
	}
	
	

	public Parent(int uID) {
		super();
		UID = uID;
	}



	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	@Override
	public String toString() {
		return "Parent [UID=" + UID + "]";
	}
	
	

}
