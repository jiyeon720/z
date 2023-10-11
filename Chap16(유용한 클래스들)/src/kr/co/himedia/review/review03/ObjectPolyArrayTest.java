package kr.co.himedia.review.review03;

public class ObjectPolyArrayTest {
// 다형성 배열 
	public static void main(String[] args) {
		
		Object[] obj = new Object[2];	//A,B 둘다들어갈수있음 Object타입이라
		obj[0] = new A();	//Upcasting
//		((A)obj[0]).printHi();
		obj[1] = new B();	//Upcasting
//		((B)obj[1]).printHi(); 			// 다운캐스팅 해야 보임 
		
		display(obj);
		
		
		
	}

	private static void display(Object[] obj) {
		for(int i=0; i<obj.length; i++) {
			if(obj[i] instanceof A) {
				((A)obj[i]).printHi();
			}else
				((B)obj[i]).printHi();
			}
		}

	
}
