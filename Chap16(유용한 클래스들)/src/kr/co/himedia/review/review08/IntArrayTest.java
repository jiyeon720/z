package kr.co.himedia.review.review08;

public class IntArrayTest {

	public static void main(String[] args) {
		
		//5개의 정수를 저장하는 배열 선언 					// 배열처럼 동작하는 클래스 
		String[] nums = new String[5];					// 배열생성동작 (method) - 고정길이
		
		// 각 요소에 값 저장 							// 저장동작 (method) - 입력, 추가
		nums[0] = "책1";	
		nums[1] = "책2";
		nums[2] = "책3";
		nums[3] = "책4";
		nums[4] = "책5";
		
		// 배열 요소 출력
		for(int i=0; i<nums.length; i++) {			// 길이를 구하는 동작 (method)
			String data = nums[i];						// 데이터를 얻는 동작 (method)
			System.out.print(data+" ");
		}
		
	}
	
}
