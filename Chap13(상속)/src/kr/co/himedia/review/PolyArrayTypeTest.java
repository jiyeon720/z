package kr.co.himedia.review;

public class PolyArrayTypeTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// Dog, Cat 을 저장할 배열 생성 
		// Animal[] ani = {new Dog(), new Cat()};
		// 다형성 배열
		Animal[] ani = new Animal[2];
		ani[0] = dog;
		ani[1] = cat;
		PolyArrayTypeTest.display(ani);
		
	}
	public static void display(Animal[]ani) {	// PolyArrayTypeTest.display(ani);
		for(int i=0; i<ani.length; i++) {
			ani[i].eat();						// ani[0] = Dog, ani[1] = Cat
			if(ani[i]instanceof Cat)
				((Cat)ani[i]).night();
		}
	}
}
