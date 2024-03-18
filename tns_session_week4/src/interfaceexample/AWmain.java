package interfaceexample;

public class AWmain  implements WildAnimal{
	@Override
	public void eat() {
		System.out.println("We love to it another small insects !!");
	}
	public void bark() {
		System.out.println("heyyyyy");
	}

	public static void main(String[] args) {
		 AWmain aw = new AWmain();
		 aw.eat();
		 aw.bark();
		

	}

}
