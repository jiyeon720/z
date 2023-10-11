package kr.co.himedia.string;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(android);	//append = 지정된 문자 추가 
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		
		
	}
	
}
