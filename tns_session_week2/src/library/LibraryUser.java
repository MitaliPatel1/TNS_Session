package library;

public class LibraryUser {
	 public String name;
	 public int id;
	 public int booksborrowedno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBooksborrowed() {
		return booksborrowedno;
	}
	public void setBooksborrowed(int booksborrowed) {
		this.booksborrowedno = booksborrowed;
	}
	@Override
	public String toString() {
		return "LibraryUser [name=" + name + ", id=" + id + ", booksborrowed=" + booksborrowedno + "]";
	}
	
	
	

}
