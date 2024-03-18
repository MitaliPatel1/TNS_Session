package inheritance_constructor;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//always call first parent class constructor
		Child c = new Child();
		Child c1 = new Child("mitu",1);
		System.out.println(c.toString());
		System.out.println(c1.toString());

	}

}
