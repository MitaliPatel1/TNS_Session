package inheritance;

public class DemoSingleInheritance {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Mitali");
		s.setAadharNo("3456 7890");
		s.setEmail("mitu@gmail.com");
		s.setUID("U1223");
		s.setCouurseName("B.tech");
		
		System.out.println(s.display() +s.toString());

	}

}
