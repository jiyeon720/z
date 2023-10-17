package kr.co.himedia.innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;			//자동으로 final상수처리됨
		
		class MyRunnable implements Runnable{
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
		}
		return new MyRunnable(); 	//MyRunnable가Runnable을 implements 했기 때문에 MyRunnable 리턴
		
	}
}
public class LocalInnerClassTest {

	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		
		
		
		
	}

}











