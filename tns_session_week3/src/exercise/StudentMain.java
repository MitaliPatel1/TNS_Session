package exercise;

public class StudentMain {

	public static void main(String[] args) {
		Student st1= new Student();
		Student st2= new Student("Mitali");
		Student st3= new Student("Hinal");
		
		System.out.println("student 1 : " + st1.getName());
		System.out.println("student 2 : " + st2.getName());
		System.out.println("student 3 : " + st3.getName());
		

	}

}
