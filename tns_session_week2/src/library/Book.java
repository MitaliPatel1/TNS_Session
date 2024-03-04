package library;

public class Book {
	 public String title;
	 public String author;
	 public int isbn;
	 public boolean availability_status;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public boolean getAvailability_status() {
		return availability_status;
	}
	public void setAvailability_status(boolean availability_status) {
		this.availability_status = availability_status;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", availability_status="
				+ availability_status + "]";
	}
	 
	 

}
