package kr.co.himedia.review.review08;

public class MyBookTest {

	public static void main(String[] args) {



		BookArray list= new BookArray();	//Book, 길이 5

		list.add(new Book("책1", 100, "책팔아요 ", "김모씨"));
		list.add(new Book("책2", 100, "책팔아요2", "박모씨"));
		list.add(new Book("책3", 100, "책팔아요3", "장모씨"));
		list.add(new Book("책4", 100, "책팔아요4", "장모씨"));
		list.add(new Book("책5", 100, "책팔아요5", "장모씨"));
		list.add(new Book("책6", 100, "책팔아요6", "장모씨"));
		


//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		System.out.println(list.get(11));
		
		
	}
}