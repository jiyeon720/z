package kr.co.himedia.object;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return title + "," + author;
	}
	
}
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("웹3.0이 온다", "장세형");
		System.out.println(book);				//	
		System.out.println(book.toString());	// 	.toString() 없어도 붙어있다생각하셈
	}

}
