package kr.co.himedia.array02;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copylib = new Book[5];
		
		library[0] = new Book("플러터 앱 개발", "이정주");
		library[1] = new Book("플러터 앱 개발1", "이정주1");
		library[2] = new Book("플러터 앱 개발2", "이정주2");
		library[3] = new Book("플러터 앱 개발3", "이정주3");
		library[4] = new Book("플러터 앱 개발4", "이정주4");
		
		
		System.arraycopy(library, 0, copylib, 0, 5);
		
		
		for(Book book : library) {
			book.showInfo();
		}
		
		System.out.println();
		
		for(Book book : copylib) {
			book.showInfo();
		}
		
		System.out.println();
		
		library[0].setTitle("안드로이드 앱 개발");
		library[0].setAuthor("집이쵝오야");
		
		System.out.println("====================================");
		
		
		for(Book book : library) {
			book.showInfo();
		}
		System.out.println();
	
		
		for(Book book : copylib) {
			book.showInfo();
		}
		System.out.println();
		
		
	}
}
