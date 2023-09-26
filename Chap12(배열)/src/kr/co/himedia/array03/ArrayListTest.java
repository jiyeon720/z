package kr.co.himedia.array03;

import java.util.ArrayList;

import kr.co.himedia.array02.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("허리디스크","자세를바로하세요"));
		library.add(new Book("목디스크","자세를바로하세요1"));
		library.add(new Book("디스크","자세를바로하세요2"));
		library.add(new Book("허리","자세를바로하세요3"));
		library.add(new Book("목","자세를바로하세요4"));
		
		
		for(int i=0; i<library.size();i++)
			library.get(i).showInfo();
		
		
	}
	
	
}
