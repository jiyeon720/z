package kr.co.himedia.number;
/*
 * 문자열을 수치형으로 변환하는 메서드 
 * 
 * Byte			parseByte()				문자열을 Byte 형으로 변환
 * Short		parseShort()				  상	  동
 * Integer		parseInteger()				  상	  동
 * Long			parseLong()					  상	  동
 * Float		parseFloat()			      상	  동
 * Double		parseDouble()		 		  상	  동
 *	 
 */
public class ParseXTest {

	public static void main(String[] args) {
		
		String str = "100"; 				//숫자로된 문자열 
		int a = Integer.parseInt(str);		// int형변환 
		double b = Double.parseDouble(str); // Double 형변환
		
		System.out.println(a + "," + b);
	
		System.out.println();
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("2024");		// valueOf String => 숫자로된 문자열만 바꿀 수 있음 
		
		System.out.println("큰 수 :" + Integer.max(n1, n2)); 	//max =>int호출하는 것처럼 두 값 중 더 큰 값을 반환합니다 Math.max.
		System.out.println("작은 수 :" + Integer.min(n1, n2));
		System.out.println("합 :" + Integer.sum(n1, n2));
		
		System.out.println("12의 2진 표현 : OB" + Integer.toBinaryString(12));//정수 인수의 문자열 표현을 기수 2의 부호 없는 정수로 반환합니다.
		System.out.println("12의 8진 표현 : 0" + Integer.toOctalString(12));//정수 인수의 문자열 표현을 기수 8의 부호 없는 정수로 반환합니다.
		System.out.println("12의 16진 표현 : 0x" + Integer.toHexString(12));//정수 인수의 문자열 표현을 16진법의 부호 없는 정수로 반환합니다.
	}
	
	
	
}
