package kr.co.himedia.arraylist;
/*
 * 학생이 수강한 과목 학점 출력하시오.
 * 2023학번 Lee와 2022학번 Shin 두 학생이 있습니다.
 * Lee학생은 국어와 수학 2과목을 신청했고,
 * Shin학생은 국어, 수학, 영어 3과목 수강했습니다.
 * 
 * Lee학생은 국어 100점, 수학은 70점 입니다.
 * Shin학생은 국어 70점, 수학은 90점, 영어 100점 입니다.
 * 
 * ArrayList를 활용하여 두 학생의 과목 성적과 총점을 구하시오.
 * 
 */

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
		
	}
		
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);			//오왕
	}
	
	public void shwoInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {	//오왕
			total += subject.getScorePoint(); 
			System.out.println("학생 " +this.studentName+"의 " +subject.getName()+ "과목 성적은 " +
								subject.getScorePoint() + "점 입니다." );
			
		}
		System.out.println("학생 " +this.studentName+
								"의 총점은 " + total + "점입니다.");
	}
	
	
}























