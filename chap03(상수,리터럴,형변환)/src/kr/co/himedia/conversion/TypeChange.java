package kr.co.himedia.conversion;

public class TypeChange {

	public static void main(String[] args) {
		byte num1 = 1;
		byte num2 = 2;
		//byte result1 = num1 + num2;		// 연산 할때에는, 정수와 정수연산은 int로 인식
		byte result1 = (byte)(num1 + num2); // (byte)넣어줌으로 강제 형변환	
		
		int num3 = 1;
		int num4 = 2;
		int result2 = num3 + num4;
		
		long num5 = 1;
		long num6 = 2;
		long result3 = num5 + num6; 		 // 자동 형변환
		
		char c = 'A';					
		int cc = c;							// 자동 형변환 65
		
		System.out.println("강제 형변환한 cc =" + cc);
		
		float num7 = 1.0f;
		float num8 = 2.0f;
		
		double num9 = 1.0;
		double num10 = 2.0;
		double result4 = num9 + num10; 		// 자동 형변환
		
		float x = 15.6f;
		int y = (int)x;					//강제 형변환(손실발생)의도하지않은값이 나올수있음. 15
		
		System.out.println("강제 형변환한 y =" + y);
		
		double dx = 14.67;
		int dy = (int)dx;			//강제 형변환(손실발생) 의도하지않은값이 나올수있음. 14
		
		System.out.println("강제 형변환한 dy =" + dy);
		
		
	}
}
