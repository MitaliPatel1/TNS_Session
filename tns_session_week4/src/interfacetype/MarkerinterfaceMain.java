package interfacetype;

public class MarkerinterfaceMain {

	public static void main(String[] args) {
        Student s=new Student(1,"Mitali",15000000,"java");
		
		
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}
		
	}


