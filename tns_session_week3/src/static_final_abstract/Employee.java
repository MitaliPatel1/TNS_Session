package static_final_abstract;

public class Employee {
	static int cnt=0;
	static String  emp_name;
	String branch_name,emp_emailid;
	public Employee() {
		cnt=cnt+1;
	}
	
	
	public static String getEmp_name() {
		return emp_name;
	}
	public static void setEmp_name(String emp_name) {
		Employee.emp_name = emp_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getEmp_emailid() {
		return emp_emailid;
	}
	public void setEmp_emailid(String emp_emailid) {
		this.emp_emailid = emp_emailid;
	}
	@Override
	public String toString() {
		return "Employee [branch_name=" + branch_name + ", emp_emailid=" + emp_emailid + "]";
	}
	
	
	
	

}
