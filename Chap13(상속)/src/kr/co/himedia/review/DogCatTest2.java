package kr.co.himedia.review;
// 
public class DogCatTest2 {

	public static void main(String[] args) {
		// Dog 객체를 생성하고 eat() 동작을 구동하기
		// Upcasting(업캐스팅) : 부모가 자식을 가리키는 객체생성방법 
		Animal dog = new Dog(); 
		dog.eat();
		
		// Cat 객체를 생성하고 eat(), night() 동작을 구동하기 
		// Upcasting(업캐스팅) : 부모가 자식을 가리키는 객체생성방법 
		Animal cat = new Cat();
		cat.eat();
//		cat.night();
		
		
	}
}
