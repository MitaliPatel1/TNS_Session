package abstraction_exercise;

public class Practice1 extends Marks{
	float mk1;
	float mk2;
	float mk3;
	public Practice1(int m1, int m2, int m3) {
		mk1 = m1;
		mk2 = m2;
		mk3 = m3;
	}
	@Override
	void getpercentage() {
		double r1 = (mk1+mk2+mk3)/300 * 100;
		System.out.println("Student A percentage : "+r1);
	}
	

}


