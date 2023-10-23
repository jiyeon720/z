package kr.ci.himedia.thread05;

import java.util.ArrayList;

class HiMediaBookStore {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public HiMediaBookStore() {
		shelf.add("인공지는 기반 자연어 처리1");
		shelf.add("인공지는 기반 자연어 처리2");
		shelf.add("인공지는 기반 자연어 처리3");
		shelf.add("인공지는 기반 자연어 처리4");
		shelf.add("인공지는 기반 자연어 처리5");
		shelf.add("인공지는 기반 자연어 처리6");
	}
	
	public String lendBook() {
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() + " : " + book + " 빌림");
		return book;
		
	}
	
	public void returnBook(String book) {
		shelf.add(book);
		System.out.println(Thread.currentThread().getName() + " : " + book + " 반납함");
	}
	
}

class Person extends Thread {
	
	public Person(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		try {
			String title = SyncWaitNotifyTest.hmBookStore.lendBook();
			if (title == null) return;
			Thread.sleep(5000);
			SyncWaitNotifyTest.hmBookStore.returnBook(title);
		} catch (InterruptedException e) { e.printStackTrace();
		
		}
	}
	
}


public class SyncWaitNotifyTest {

	public static HiMediaBookStore hmBookStore = new HiMediaBookStore();
	
	public static void main(String[] args) {
		
		Person person1 = new Person("person1");
		Person person2 = new Person("person2");
		Person person3 = new Person("person3");
		Person person4 = new Person("person4");
		Person person5 = new Person("person5");
		Person person6 = new Person("person6");
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();
		
		
		
	}
	
	
	
}










