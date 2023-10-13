package kr.co.himedia.set03;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student() {}
	public Student(String name, int age) {
		this.name=name;
		this.age = age;
	}
	public String toString() {
		return name + " : " + age;
	}
	@Override
	public int compareTo(Student stu) {	//이게 있어야 비교가능 Studunt의 implements Comparable<Student> / Comparable이 비교 인터페이스 
//		return this.age - stu.age;		//나이를 기준으로 오름차순 정렬 20,30,40
//		return stu.age - this.age;		//나이를 기준으로 내림차순 정렬 40,30,20
//		return this.name.compareTo(stu.name);	// 이름을 기준으로 오름차순 정렬 가나다라..
		return stu.name.compareTo(this.name); 	// 이름을 기준으로 내림차순 정렬 
	}
	
}

public class ComparableTest {

	public static void main(String[] args) {
		
		Set<Student> tree = new TreeSet<>();
		tree.add(new Student("이순신", 30));
		tree.add(new Student("신사임당", 40));
		tree.add(new Student("류성룡", 20));
		
		for(Student s : tree)
			System.out.println(s);
		
		
	}
	
	
	
	
}

