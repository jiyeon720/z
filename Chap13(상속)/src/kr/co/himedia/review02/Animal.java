package kr.co.himedia.review02;
// 추상클래스 ( 불완전한 클래스 )
public abstract class Animal{
	

	public abstract void eat();		// 추상메서드 (불완전한 메서드) : 메서드의 구현부가 없음 
									// 반드시 자식이 완전하게(재정의) 해야 함 
	
	public void move() {						// 일반 구현메서드 
		System.out.println("뚜벅뚜벅 이동한당");
	}
}
