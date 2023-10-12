package kr.co.himedia.generic05;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {

	public static void main(String[] args) {
	
		Pair<String, Integer> pair = new Pair<>("안뇽", 2023);
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		
		Map<String, Integer> maps = new HashMap<>();
		maps.put("kor", 90);
		maps.put("eng", 80);
		maps.put("nath", 100);
		
		System.out.println(maps.get("kor"));
		System.out.println(maps.get("eng"));
		System.out.println(maps.get("nath"));
		
		
		
	}
	
	
}
