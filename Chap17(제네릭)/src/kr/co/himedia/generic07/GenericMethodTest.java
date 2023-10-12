package kr.co.himedia.generic07;

class MyData{
	
	public static <T> T showData(T data) {
		
		if(data instanceof String)
			System.out.println("문자열");
		else if(data instanceof Integer)
			System.out.println("정수형");
		else if(data instanceof Double)
			System.out.println("실수형");
		
		return data;
		
	}
}

public class GenericMethodTest {

	public static void main(String[] args) {
		
		MyData.showData("안뇽?");		// <String> 생략
		MyData.<Integer>showData(1);	
		MyData.showData(6);			
		MyData.showData(1.2);		// <Double> 생략
		MyData.showData("안뇽?");
		MyData.showData(4.6);
		
		
		
	}
	
}
