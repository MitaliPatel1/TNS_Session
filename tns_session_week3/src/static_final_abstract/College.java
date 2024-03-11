package static_final_abstract;

public class College {
	// static....block,function,variable
	final int sid=0;
	static int cnt=0;// depends on class , single copy ...
	static String College_name="Silveroak";
	String stu_name,stu_email;
	
	static void getMsg() {
		//stu_name="Mitali"; static function can access only static variable
		System.out.println(College_name);
		
	}
//	final void getMsg() {
//		System.out.println(College_name);
//		}
	static {
		
	}
	
	public College() {
		cnt=cnt+1;
	}
	
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_email() {
		return stu_email;
	}
	public void setStu_email(String stu_email) {
		this.stu_email = stu_email;
	}
	@Override
	public String toString() {
		return "College [stu_name=" + stu_name + ", stu_email=" + stu_email + "]";
	}
	

}
