package kr.co.himedia.number;

public class AutoBoxingUnboxingTest {

	public static void main(String[] args) {
		
		// 오토 박싱 10이 객체로 업글됨 / 래퍼클래스의 참조변수에 기본자료형 값이 대입됨
		Integer iObj = 10;
		Double dObj = 3.14;
		
		// 오토 언박싱 / 래퍼클래스형 참조변수를 기본자료형의 변수에 대입됨.
		int num1 = iObj;
		double num2 = dObj;
		
		
		System.out.println(num1 +", "+ iObj);
		System.out.println(num2 +", "+ dObj);
		
	}
	
}
