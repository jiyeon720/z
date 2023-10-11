package kr.co.himedia.object;

public class Student implements Cloneable{
								// └ clone을 허용하겠다 라는 뜻 
	private int studentId;
	private String studentName;


	public Student(int studentId, String studentName) {
		//		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}


	@Override
	public boolean equals(Object obj) {		// Object obj 의 student1 , student2 ==> 객체 비교 대상
		if(obj instanceof Student) {				// ★
			Student stu = (Student)obj;
			if(this.studentId == stu.studentId)
				return true;
			else 
				return false;

		}
		return false;
	}
	@Override
	public int hashCode() {			// ☆ false true 2023 2023 
		return studentId;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}


	
	
	
	
	
	
}
