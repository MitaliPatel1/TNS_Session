package abstraction_exercise;

public class Practice2 extends Marks{
	float m1;
	float m2;
	float m3;
	float m4;
	public Practice2(int m1, int m2, int m3, int m4) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	@Override
	void getpercentage() {
		double r2 =(m1+m2+m3+m4)/400 * 100;
		System.out.println("Student B percentage : "+r2);
	}



}
