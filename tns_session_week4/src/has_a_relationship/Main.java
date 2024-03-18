package has_a_relationship;

public class Main {

	public static void main(String[] args) {
		Address addr = new Address();
		addr.setArea("Naranpur");
		addr.setPincode(380013);
		addr.setStreername("sdf");
		Person p = new Person();
		p.setFullname("Mitali navadiya");
		p.setAdd(addr);
		p.setMobileNo(234567895);
		System.out.println(p.toString());

	}

}
