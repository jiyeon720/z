package kr.co.himedia.number;

public class BoxingUnboxingTest {

	public static void main(String[] args) {
		
		//박싱 [값이 객체로됨 / 기본자료형 값이 박싱에의해 클래스 자료형으로 대입함]
		Integer iObj = Integer.valueOf(10);
		Double dObj = Double.valueOf(3.14);
		
		
		// 값을 출력함 /  래퍼클래스 toString() 메서드가 오버라이딩으로 재정의 됨 -> 기본형자료값이 출력됨.
		System.out.println(iObj.toString() + "," + dObj.toString());
		
		
		
		
		//언박싱 [객체를 값으로 / 래퍼클래스의 메서드를 통해 기본 자료형의 값을 구함]
		iObj.intValue();
		dObj.doubleValue();
		
		
		System.out.println(iObj + "," + dObj);
	
	
	}
	
}
