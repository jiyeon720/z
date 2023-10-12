package kr.co.himedia.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {

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
		
		// 반복자 획득 
		Iterator<String> itr = list.iterator();
		
		// 반복자 이용한 순차적 참조 
		String str0;
		while(itr.hasNext()) {
			str0 = itr.next();
			System.out.print(str0 + "\t");
		}
		
		// 첫번째 객체
		list.remove(0);
		
		// 삭제 후 객체 참조
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+ "\t");
		System.out.println();
		
		// 반복자 획득
		itr = list.iterator();
		
		//삭제 후 결과 확인
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		
		System.out.println();
		
		list.set(1, "과자");
		for(String str : list)
			System.out.print(str.toString()+ "\t");
		
	}
}
