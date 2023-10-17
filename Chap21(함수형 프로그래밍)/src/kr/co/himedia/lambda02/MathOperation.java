package kr.co.himedia.lambda02;

@FunctionalInterface		// 함수형 인터페이스 컴파일러에게 알림
public interface MathOperation {

	public int operation(int x, int y);	// 추상메서드
//	public int operation(int x, int y);	->오류남 하나만 정의가능 
	
}
