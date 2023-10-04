package kr.co.himedia.review02;

public class NoOverrideTest {

	public static void main(String[] args) {
		
		
		/*
		 *  재정의를 안했기 때문에 부모가 메시지를 보내면 오동작을 함
		 *  -> 다형성을 보장하지 않음 
		 *  --> 다형성을 보장하려면 재정의를 강제로 하도록 만들어 주어야 함 
		 *  ---> [추상클래스, 인터페이스] = (다형성이 보장됨) 
		 */
		
		
		Animal ani = new Dog();			//Dog,Cat에 eat 안되어있는상태 => Animal의 eat 호출
		ani.eat();
		
		ani = new Cat();				//Dog,Cat에 eat 안되어있는상태 => Animal의 eat 호출
		ani.eat();
		
	}
	
}
