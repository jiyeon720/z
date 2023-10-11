package kr.co.himedia.string;

public class StringTest02 {
	
	public static void main(String[] args) {
		String java = new String("java");
		String kotlin = new String("kotlin");
		System.out.println(System.identityHashCode(java));
		//identityHashCode 주어진 객체의 클래스가 hashCode()를 재정의하는지 여부에 관계없이
		//기본 메서드 hashCode()가 반환하는 것과 동일한 객체에 대해 동일한 해시 코드를 반환합니다
		
		java = java.concat(kotlin);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
	}
}
