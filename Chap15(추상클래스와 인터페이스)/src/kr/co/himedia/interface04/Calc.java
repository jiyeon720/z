package kr.co.himedia.interface04;
//계산기 기본기능이 인터페이스라 볼수있움
public interface Calc {

	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1,int num2);
	
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0; 
		
		for(int i : arr)
			total += i;
		
		mystasicMethod();
		
		return total;
	}
	
	private void myMethod() {
		System.out.println("private method");
		
	}
	
	private	static void mystasicMethod() {
		System.out.println("private static method");
	}
	
	
}
