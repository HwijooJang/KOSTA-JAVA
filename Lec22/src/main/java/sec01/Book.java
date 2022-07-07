package main.java.sec01;

class SimpleFilePersistence{
	void save(Book book) {
		System.out.println(book.getTitle()+":"+ book.getAuthor());
	}
}

public class Book {
	public String getTitle() {
		return "좋은 책";
	}
	public String getAuthor() {
		return "훌륭한 저자";
	}
	public int getCurrentPage() {
		return 1;
	}
	
}



