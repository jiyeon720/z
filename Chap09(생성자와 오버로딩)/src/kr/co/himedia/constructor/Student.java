package kr.co.himedia.constructor;

public class Student {
		//멤버변수
	int studentId;
	String studentName;
	int grade;
	
	public Student () {
		System.out.println("기본생성자 호출");
	}
	
	public Student (int studentId, String studentName,int grade) {
		this.studentId = studentId; // 초기화
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	public String showInfo() {
		return studentName + "학생의 학번은" + studentId + "이고, "
				+ grade + "학년 입니다.";
				
	}
	
}
