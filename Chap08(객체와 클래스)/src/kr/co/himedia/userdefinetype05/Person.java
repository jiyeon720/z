package kr.co.himedia.userdefinetype05;

// 객체(Object) = 상태정보(멤버변수) +행위정보(멤버메서드) 
public class Person {

	String name;
	int age;
	String phone;
	
	//기본생성자(메서드)생략↓
	public Person() {
		// 객체를 생성하는 코드 생략
	}
	
	public void play() {
		System.out.println("운동을 한다");
	}
	
	public void eat() {
		System.out.println("음식을 먹다");
	}
	public void walk() {
		System.out.println("걷다");
	}
	
	
}
