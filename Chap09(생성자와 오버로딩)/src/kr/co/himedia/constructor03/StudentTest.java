package kr.co.himedia.constructor03;

public class StudentTest {

	public static void main(String[] args) {
		//기본생성자 호출
	Student student = new Student();
	System.out.println(student.getName());
	System.out.println(student.getAge());
	
	

	
	//매개변수가 String, int 타입이 있는 생성자 호출
	Student student2 = new Student("김지연,가시");
	System.out.println(student2.toString());
	
	//매개변수가 String만 있는 생성자 호출
	Student student3 = new Student("호엥");
	System.out.println(student3.toString());
	
	//매개변수가 int만 있는 생성자 호출
	Student student4 = new Student("헤헹");
	System.out.println(student4.toString());
	
	
	}
}
