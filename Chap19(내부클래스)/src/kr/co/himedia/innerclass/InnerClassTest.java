package kr.co.himedia.innerclass;

class OutClass{			
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();			// 내부 클래스 생성
	}
	
	class InClass{			//OutClass에서 InClass 생성가능 inner class : 외부클래스가 생성된 후 생성
		int inNum = 100;
//		static int sInNum = 200;		static 메서드는 에러남
		void InTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 클래스 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println();
		}	
	}
	
	public void usingInClass() {
		inClass.InTest(); 			// 내부 클래스의 변수를 사용하여 내부클래스의  메서드를 호출함
	}
	
	static class InStaticClass {	// 스테틱(고정된)이 있는 클래스 만듦
		int inNum = 100;
		static int sInNum = 200;	
		
		// 정적클래스의 일반 메서드 
		void inTest() {
//			num +=10;  / 외부 클래스의 인스턴스 변수는 사용불가 
			System.out.println("InStaticClass inNum = "+inNum+"(정적 내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(정적 내부 클래스의 스테틱 변수 사용)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 스테틱 변수 사용)");
		}
		
		// 정적(static) 클래스의 static 메서드
		static void sTest() {
//			num += 100; 	 / 외부 클래스의 인스턴스변수 사용 불가 
//			inNum += 10;	/ 내부 클래스의 인스턴스 변수 사용 불가
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 스테틱변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부클래스의 스테틱변수 사용)");
			
		}
	}
	
}




public class InnerClassTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스의 변수를 이용하여 내부클래스 매서드(기능) 호출↓");
		outClass.usingInClass(); 		// 외부 클래스를 이용하여 내부클래스 메서드를 호출
		
		System.out.println("(이미 만들어진)외부클래스를 이용하여 내부 클래스 생성↓");
		//(이미 만들어진)외부클래스를 이용하여 내부 클래스 생성
		// 접근방식 OutClass.InClass 	
		OutClass.InClass inClass = outClass.new InClass();	//InClass 생성	
		inClass.InTest();									//15번의 InTest 불러들이기
		System.out.println();
		
		// inStaticClass 외부클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		// 정적 내부 클래스의 일반 메서드 호출
		inClass.InTest();
		System.out.println();
		
		// 정적 내부 클래스의 스테틱 메서드 호출
		OutClass.InStaticClass.sTest();
		
	}
	
	
}















