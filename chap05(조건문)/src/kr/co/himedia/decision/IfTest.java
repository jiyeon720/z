package kr.co.himedia.decision;

public class IfTest {

	public static void main(String[] args) {
		
		int num = 100;
		if(num > 50) {
			System.out.println("num 변수의 값이 50보다 큽니다.");
		}
		
		
		//한줄만 실행하면 중괄호 생략가능
		if(num >60)
			System.out.println("num 변수의 값이 60보다 큽니다.");
		
		
		// 같은 줄에 작성 가능. 실행문장 끝은 ;(세미콜론)으로 구성
		if(num > 70) System.out.println("num 변수의 값이 70보다 큽니다.");
		
		
		//한줄만 실행하면 중괄호 생략가능 
		if(num<50)
			System.out.println(num); //이줄은 생략되어 아랫줄만 실행되었으므로 중괄호생략가능한것
		System.out.println("num 변수의 값이 50보다 작습니다.");
		
		
		System.out.println("end");
		
	}
}
