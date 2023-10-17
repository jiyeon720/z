package kr.co.himedia.innerclass;

class Outter{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;			//자동으로 final상수처리됨
		 
		return new Runnable(){
			int localNum = 10;
			
			@Override
			public void run() {		//이 run() 메서드는 나중에 또 호출될 수 있음 
//				i=100;				// 매개변수는 자동으로 상수 (final) 로 바뀜 
//				num = 200;			// 지역변수는 자동으로 상수 (final) 로 바뀜
				System.out.println("i =" + i);
				System.out.println("num =" + num);		 
				System.out.println("localNum =" + localNum);
				System.out.println("outNum =" + outNum + "외부클래스의 인스턴스 변수"); 
				System.out.println("Outer.sNum =" + sNum + "외부클래스의 정적 변수");	// 읽는(출력) 것은 상관없음
			}
		};
		
	}
	
	Runnable runner = new Runnable() {	// Runnable 변수이름 = > runner로 정의 , 클래스 이름은 생략 ==>익명(내부)클래스
										 
		@Override
		public void run() {										//↘ runner로 정의됨. 클래스이름생략.
			System.out.println("Runnable이 구현된 익명 클래스 변수");	//↗
			
		}
	};
	
	
	
	
}
public class AnonymousInnerClassTest {

	
	public static void main(String[] args) {
		
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
		System.out.println();
		
		out.runner.run();
		
		
		
		
		
	}

}











