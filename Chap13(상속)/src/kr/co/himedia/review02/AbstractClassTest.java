package kr.co.himedia.review02;

public class AbstractClassTest {

	public static void main(String[] args) {
		/*
		 * 추상클래스는 단독으로 객체 생성 불가함 
		 */
		
		// Animal ani = new Animal(); 			//Cannot instantiate (객체생성 불가함)
		
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		
		ani = new Cat();
		ani.eat();
		ani.move();
		((Cat)ani).night();
	}
}
