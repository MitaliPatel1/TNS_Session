package exception_example;

public class Student {
private int roll_no;
private String name;
private float per;

public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPer() {
	return per;
}
public void setPer(float per) {
	try {
	 PercantageValidator.isValidPercentage(per);
		this.per = per;
	}
	catch(ArithmeticException e) {
		System.out.println("invalid percentage");
	}
}
public void show(){
	if(per>=0) {
		System.out.println("name : " + name + " roll no : " + roll_no + " per : " + per);
	}
	else {
		System.out.println("name : " + name + " roll no : " + roll_no + " per : " + 0);
	}
}

}
