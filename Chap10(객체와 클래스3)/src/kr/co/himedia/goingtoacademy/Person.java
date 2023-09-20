package kr.co.himedia.goingtoacademy;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("no name", 10);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void showInfo() {
		System.out.println("name : " +name+ ", age : " + age);
	}
	
	//								//							//
	//클래스타입으로해봅시당
	public Person getPerson() {
		return this;
		
	}
	
	
	//출력을 하여봅시당.
	public static void main(String[] args) {
		Person person = new Person();
		person.showInfo();
		
		Person person2 = person.getPerson();
		System.out.println(person);
		System.out.println(person2);
		// person,person2 의 주소값이 같음 this사용해서 자기자신을 가르키기 때문
		
		
		Person person3 = new Person("김지연",20);
		person3.showInfo();
		System.out.println(person3);
	}
}









