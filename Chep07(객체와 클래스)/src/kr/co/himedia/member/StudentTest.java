package kr.co.himedia.member;
// 학생 클래스를 생성하여 객체(인스턴스)에 각각 다른 이름과 주소를 대입함

public class StudentTest {

	public static void main(String[] args) {
		
		//사용자 지정 객체지정 [ Student ]
		Student student1 = new Student();
		student1.studenName = "이순신";
		student1.address = "서울 강동구";
		
		student1.showStudenInfo();
		
		Student student2 = new Student();
		student2.studenName = "신사임당";
		student2.address = "하남시";
		
		student2.showStudenInfo();
		
		System.out.println(student1);
		System.out.println(student2);
		
		
	}
}
