package library;

public class LibraryPackageDemo {

	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("Northpol");
		b.setAuthor("Jitesh Donga");
		b.setIsbn(10);
		b.setAvailability_status(true);
		System.out.println(b.toString());
		
		LibraryUser l = new LibraryUser();
		l.setName("Mitali");
		l.setId(3);
		l.setBooksborrowed(45);
		
		System.out.println(l.toString());

	}

}
