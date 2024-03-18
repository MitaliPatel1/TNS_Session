package inheritance;

public class DemoMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City c =  new City();
		c.setCountryName("Bharat");
		c.setCapital("delhi");
		c.setCityName("Ahemdabad");
		c.setArea((float) 2435.33);
		c.setStateName("Gujrat");
		c.setLanguage("Gujrati");
		System.out.println(c.toString()+c.statedisplay()+c.countrydisplay());

	}

}
