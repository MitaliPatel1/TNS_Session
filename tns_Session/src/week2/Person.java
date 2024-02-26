package week2;

public class Person {
	private String name;
	private int age;
	private String email;
	private double income;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", income=" + income + "]";
	}
	
	public void vote() {
		if(age>18) {
			System.out.println("eligible to voting...");
		}
		else {
			System.out.println("not eligible");
		}
	}
	
	

}
