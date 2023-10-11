package kr.co.himedia.object;

public class EqualsTest {


	public static void main(String[] args) throws CloneNotSupportedException {

		String str1 = new String("himedia");
		String str2 = new String("himedia");

		System.out.println(str1.equals(str2));	//같아서 트루~~~~ 스트링의 equals~

		System.out.println(str1.hashCode());	// 재정의가 되어있당 
		System.out.println(str2.hashCode());	// 내용이 같당
		
		
		System.out.println();
		
//		Integer i1 = new Integer(100);
//		Integer i2 = new Integer(100);
//		
		Integer i1 = 100;		// 이렇게도 가능
		Integer i2 = 100;
		
		System.out.println(i1.equals(i2));			// 번짓수 다름
		System.out.println(i1.hashCode());			
		System.out.println(i2.hashCode());
		
		System.out.println();
		
		Student student1 = new Student(2023, "HiMedia");		// 번짓수 다름
		Student student2 = new Student(2023, "HiMedia");
		
		
		System.out.println(student1 == student2);		// 번짓수 다르기때문에 false
		System.out.println(student1.equals(student2));	// 번짓수 다르기때문에 false 재정의를 해야 함 
		
		System.out.println(student1.hashCode());		// Student ★ 재정의 한 후 false true 1910163204 305623748
		System.out.println(student2.hashCode());
		
		System.out.println(System.identityHashCode(student1));
		System.out.println(System.identityHashCode(student2));
		
		System.out.println();
		
		Student student3 = (Student)student1.clone();
		
		System.out.println(student1 == student3);
	    System.out.println(student1.equals(student3));
	    
	    System.out.println(student1.hashCode());
	    System.out.println(student3.hashCode());
	    
	    System.out.println(student1);
	    System.out.println(student3);
	}
}
