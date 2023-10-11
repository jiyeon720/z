package kr.co.himedia.review.review03;

public class ObjectPolyparaTest {

	public static void main(String[] args) {
		
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
		
		
	}

	private static void display(Object obj) {		// 다형성 인수 활용 
		if(obj instanceof A)		//instanceof[원래 인스턴스의 형[타입]이 맞는지 여부를 체크하는 연산자 ] 활용
			((A)obj).printHi();
		else
			((B)obj).printHi();
	}
	


}
