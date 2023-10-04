package kr.co.himedia.review;
//  1) 수평적 구조
public class DogCatTest {

	public static void main(String[] args) {
		// Dog 객체를 생성하고 eat() 동작을 구동하기
		Dog dog = new Dog(); 
		dog.eat();
		
		// Cat 객체를 생성하고 eat(), night() 동작을 구동하기 
		Cat cat = new Cat();
		cat.eat();
		cat.night();
		
		
	}
}
