package library;

public class MainClass {
	
	public static void main(String[] args) {
		int shelfNumber = 5;
		Library library = new Library(shelfNumber);
		
		Book book1, book2, book3;
		
		book1 = new Book("Suç ve Ceza", "Dostoyevski", "978485478", 1, 1);
		book2 = new Book("İkinci Kitap", "Yazar", "978458687");
		book2.setShelfNumber(1);
		book2.setOrder(0);
		book3 = new Book();
		book3.setBookName("Efsane Kitap");
		book3.setAuthorName("Efsane Yazar");
		book3.setISBN("97854875642");
		book3.setShelfNumber(2);
		book3.setOrder(2);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		library.showShelf(1);
		library.deleteBook(book2);
		library.showShelf(1);
	}

}
