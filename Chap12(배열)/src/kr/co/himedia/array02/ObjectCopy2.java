package kr.co.himedia.array02;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copylib = new Book[5];
		
		library[0] = new Book("플러터 앱 개발", "이정주");
		library[1] = new Book("플러터 앱 개발1", "이정주1");
		library[2] = new Book("플러터 앱 개발2", "이정주2");
		library[3] = new Book("플러터 앱 개발3", "이정주3");
		library[4] = new Book("플러터 앱 개발4", "이정주4");
		
		copylib[0] = new Book();
		copylib[1] = new Book();
		copylib[2] = new Book();
		copylib[3] = new Book();
		copylib[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copylib[i].setTitle(library[i].getTitle());
			copylib[i].setAuthor(library[i].getAuthor());
		}
	
		library[0].setTitle("집에가자");
		library[0].setAuthor("눕고싶엉");
		
		
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
