package kr.co.himedia.interface07;

public class MyBookShelfTest {

	public static void main(String[] args) {
		
		Queue bQueue = new MyBookShelf();
		
		bQueue.enQueue("핸즈온 머신러닝");
		bQueue.enQueue("생성 AI를 이용한 어쩌구");
		bQueue.enQueue("만들면서 배우는 생성 AI");
		bQueue.enQueue("생성 AI를 이용한 어쩌구2");
		bQueue.enQueue("만들면서 배우는 생성 AI2");
		
		
		System.out.println(bQueue.getSize()+"권");
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.getSize()+"권");
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.getSize()+"권");
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.getSize()+"권");
		
	}
	
	
	
	
}
