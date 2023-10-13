package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> stuScores = new HashMap<>();
		stuScores.put("Kim", 95);
		stuScores.put("Lee", 85);
		stuScores.put("Park", 90);
		stuScores.put("Choi", 80);
		
		System.out.println("Kim' score : " + stuScores.get("Kim"));		// Kim=>key값
		System.out.println("Kim' score : " + stuScores.get("Lee"));		// Lee=>key값
		
		
		stuScores.put("Park", 92);	// 수정 90->92 Value 변경
		System.out.println("Park' score : " + stuScores.get("Park"));		
		
		stuScores.remove("Choi");	// 수정 80->null Value 삭제됨.
		System.out.println("Choi' score: " + stuScores.get("Choi"));
		
		System.out.println();
		
		for(Map.Entry<String, Integer> entry : stuScores.entrySet()) {
			System.out.println(entry.getKey() + "'s score :" + entry.getValue()); //getKey(), getValue 활용
		}
	}
	
	
}
