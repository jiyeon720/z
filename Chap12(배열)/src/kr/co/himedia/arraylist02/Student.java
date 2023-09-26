package kr.co.himedia.arraylist02;

import java.util.ArrayList;
/*
 * HiMedia 학원에 학생이 3명 있습니다.
 * 각 학생마다 읽은 책을 기록하고 있습니다.
 * 학생마다 읽은 책을 Student 클래스 내에 ArrayList를 생성하여 관리하도록 합니다.
 * 
 *  결과예시)
 *  	Lee 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 *  	Shin 학생이 읽은 책은 : 딥러닝1,딥러닝2,딥러닝3 입니다.
 *  	Kim 학생이 읽은 책은 : 러닝머신1,러닝머신2,러닝머신3,러닝머신4,러닝머신5,러닝머신6 입니다.
 */

public class Student {

	private int studentId;
	private String studentName;
	
	private ArrayList<Book> bList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		bList = new ArrayList<>();
	
	}
	public void addBook(String name, String score) {
		Book book = new Book();
		book.setName(name);
		book.setBlist(score);
		
		bList.add(book);
	}
	   public void showInfo() {
		   
		      System.out.print(this.studentName+ "학생이 읽은 책은 : ");
		         
		      for(Book book : bList) {
		         System.out.print(book.getName() + " ");
		      }
		      System.out.println(" 입니다.");
		   }
		   
		

	
	
	
}
