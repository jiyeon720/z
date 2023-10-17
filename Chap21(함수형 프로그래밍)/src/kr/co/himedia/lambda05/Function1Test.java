package kr.co.himedia.lambda05;

public class Function1Test {

	public static void main(String[] args) {
		
		Function1<Integer, Integer, Integer, Integer> function1 = (t, e, r) -> t + e + r;
		int i = function1.apply(10, 20, 30);
		System.out.println(i);
		
		
//		Function1<Integer, Integer, Integer, Integer, Integer> function1 = (t, e, r, u) -> t+e+r+u;
//		int i = function1.apply(10, 20, 30, 40);
//		System.out.println(i);
	}
}
