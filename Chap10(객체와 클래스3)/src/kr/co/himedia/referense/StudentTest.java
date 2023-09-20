package kr.co.himedia.referense;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student(202309, "김지연");
		student.setKoeraSubject("국어", 100);
		student.setmathSubject("수학", 80);
		student.showScore();
		
		Student student2 = new Student(202310, "뇽뇽뇽");
		student2.setKoeraSubject("국어", 95);
		student2.setmathSubject("수학", 90);
		student2.showScore();
	}
}
