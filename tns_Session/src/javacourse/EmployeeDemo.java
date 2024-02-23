package javacourse;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEname("Mitali");
		e.setDesignation("java developer");
		e.setEmail("mitali@gmail.com");
		System.out.println(e.toString());
	}

}
