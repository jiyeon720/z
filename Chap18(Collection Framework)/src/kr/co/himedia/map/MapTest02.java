package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

	public static void main(String[] args) {
		
		Map<Character, Integer> charCountMap = new HashMap<>();
		String str = "Hello, Himedia";	//문자열 하나하나 H,e,l,l,o,..
		char[] strArray = str.toCharArray();		//문자열을 캐릭터타입으로 => toCharArray()
		
		for(char c : strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else 
				charCountMap.put(c, 1);
		}
		
		System.out.println("각 Character 갯수" );
		for(char c : charCountMap.keySet()) {
			System.out.println(c +" : "+ charCountMap.get(c));
		}
	}
	
	
	
}
