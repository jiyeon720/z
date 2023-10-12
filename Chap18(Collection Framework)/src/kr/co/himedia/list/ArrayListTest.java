package kr.co.himedia.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		//객제 저장 : 순서 있음. 중복 허용
		list.add("오렌지");
		list.add("사과");
		list.add("사과");
		list.add("바나나");
		
		// 객체 참조
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+ "\t");
		System.out.println();
		
		// 첫번째 객체
		list.remove(0);
		
		//삭제 후 객체 참조
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+ "\t");
		System.out.println();
		
		list.set(1, "과자");
		for(String str : list)
			System.out.print(str.toString()+ "\t");
		
	}
}
