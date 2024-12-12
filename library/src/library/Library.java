package library;

public class Library {
	
	Shelf shelves[];
	
	public Library(int shelfNumber) {
		shelves = new Shelf[shelfNumber];
		for(int i = 0; i < shelfNumber; i++) {
			shelves[i] = new Shelf();
		}
	}
	
	public void addBook(Book book) {
		shelves[book.getShelfNumber()].addBook(book);
	}
	
	public Book deleteBook(Book book) {
		return shelves[book.getShelfNumber()].deleteBook(shelves[book.getShelfNumber()].books.indexOf(book));
	}
	
	public Book searchBook(String bookname) {
		for(int i = 0; i < shelves.length; i++) 
			for (Book booktmp : shelves[i].books) 
				if(booktmp.getBookName().compareTo(bookname) == 0)
					return booktmp;
		return null;
			
				
		}
	
	public void showShelf(int shelfNo) {
		System.out.println(shelfNo + ". rafta bulunan kitaplar aşağıdaki gibidir...");
		System.out.println("Kitap Adı\tYazar\tISBN");
		for(int i = 0; i < shelves[shelfNo].books.size(); i++) {
			System.out.println( shelves[shelfNo].books.get(i).getBookName() + "\t" +
								shelves[shelfNo].books.get(i).getAuthorName() + "\t" +
								shelves[shelfNo].books.get(i).getISBN());
		}
	}
	
	
	
}
	
	
	
	

