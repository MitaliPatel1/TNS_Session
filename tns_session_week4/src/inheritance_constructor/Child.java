package inheritance_constructor;

public class Child  extends Parent{
	 private String name;
	 
	 public Child() {
		 super(); //will call parent class constructor
		 name="test";
	 }
	 
	 

	public Child(String name,int UID) {
		super(UID);
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Child [name=" + name + "]" + " " + getUID();
	}
	 
	 

}
