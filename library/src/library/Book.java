package library;

public class Book {
	private String bookName;
	private String authorName;
	private String ISBN;
	private int shelfNumber;
	private int order;
	
	public Book() {}

	
	public Book(String bookName, String authorName, String ISBN) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.ISBN = ISBN;		
	}
	
	public Book(String bookName, String authorName, String iSBN, int shelfNumber, int order) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		ISBN = iSBN;
		this.shelfNumber = shelfNumber;
		this.order = order;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getShelfNumber() {
		return shelfNumber;
	}
	public void setShelfNumber(int shelfNumber) {
		this.shelfNumber = shelfNumber;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
}
