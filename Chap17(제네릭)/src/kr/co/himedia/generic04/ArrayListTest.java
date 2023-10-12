package kr.co.himedia.generic04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("극한직업", "몰랑", "20XX년", "한국"));
		list.add(new Movie("극한직업", "몰랑", "20XX년", "한국"));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		
	}
	
}
