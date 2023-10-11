package kr.co.himedia.number;

public class NumberTest {

	public static void main(String[] args) {
		
//		Integer num1 = new Integer(20);
		Integer num1 = Integer.valueOf(20); 	// valueOf = 객체화
		System.out.println(num1.intValue());	// Value = 변환 int,double 등 앞자리붙인걸로 변환해줌
		System.out.println(num1.doubleValue());
		
		Double num2 = Double.valueOf(3.14);
		System.out.println(num2.intValue());	// 정수로 변환이니까 뒷자리0.14 없어짐 
		System.out.println(num2.doubleValue());
		
		
	}
	
}
