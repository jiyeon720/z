package kr.co.himedia.set03;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("이순신");
		tree.add("류성룡");
		tree.add("신사임당");
		tree.add("최무선");
		tree.add("신사임당");
		
		System.out.println("객체 수 :" + tree.size()); //신사임당 중복 허용 안됨
		
		//Iterator 반복자에 의한 반복 
		for(Iterator<String> itr = tree.iterator(); itr.hasNext(); )
			System.out.print(itr.next().toString()+"\t");
		System.out.println();
		
		
	}
	
	
}
