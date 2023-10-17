package kr.co.himedia.lambda;
//하나만 정의 가능 
//@FunctionalInterface	// 생략해도 함수형프로그래밍사용가능하나 안전하게사용하기위해 사용하는편이 좋음 
public interface Add {

	public int add(int x, int y);
	
}
