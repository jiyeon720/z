package kr.co.himedia.review.review03;
// 다형성 / Object에도 적용가능 
public class ObjectTest {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		Object obj = new A();	// Upcasting
		((A)obj).display(); 	// Downcasting
		
		obj = new B();
		((B)obj).printHi();
	}
}
