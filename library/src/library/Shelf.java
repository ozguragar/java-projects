package library;

import java.util.ArrayList;

public class Shelf {
	public ArrayList<Book> books;
	
	public Shelf() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public boolean deleteBook(Book book) {
		return books.remove(book);
	}
	
	public Book deleteBook(int order) {
		return books.remove(order);
	}
	
}
