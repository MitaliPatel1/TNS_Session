package tns_session_week3;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();// create object , constructor is called automatically 
		System.out.println(s.toString());
		
		Student s1 = new Student(2,"Mitali","mitu@gmail.com");
		System.out.println(s1.toString());
		
		s1.setUID(3);
		s1.setSfullname("mitu");
		s1.setSemail("mmm@gmail.com");
		
		System.out.println(s1.toString());

	}

}
