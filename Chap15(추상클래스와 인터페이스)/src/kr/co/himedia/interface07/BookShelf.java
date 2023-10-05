package kr.co.himedia.interface07;
// 책꽂이 --- 책을 보관(자료구조, ArrayList)

import java.util.ArrayList;

public class BookShelf {
	
	protected ArrayList<String> bookshelf;
	
	public BookShelf() {
		bookshelf = new ArrayList<>();
	}

	public ArrayList<String> getBookshelf() {
		return bookshelf;
	}
	public int getCount() {
		return bookshelf.size();
	}
	
	
}
