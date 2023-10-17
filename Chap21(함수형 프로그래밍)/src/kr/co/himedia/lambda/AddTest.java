package kr.co.himedia.lambda;

public class AddTest {

	public static void main(String[] args) {
		
		Add addA = (int x,int y) -> {return x + y ;};
		Add addB = (x,y) -> x+y;
		
		System.out.println(addA.add(1, 2));
		System.out.println(addB.add(10, 20));
		
		
	}
}
