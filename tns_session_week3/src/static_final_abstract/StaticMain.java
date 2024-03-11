package static_final_abstract;

public class StaticMain {

	public static void main(String[] args) {
		College c1 = new College();
		College c2 = new College();
		College c3 = new College();
		College c4 = new College();
	System.out.println(c1.stu_name);
	System.out.println("total count is "+College.cnt );
	College.getMsg();
	
	

	}

}
