package kr.co.himedia.review;

public class Cat extends Animal{
	
	public Cat() {
		super();			// new Object()
	}
	
	public void eat() {
		System.out.println("새침하게 먹어용");
	}

	
	public void night() {
		System.out.println("밤에 집안에서 돌아다녀용");
	}
}
