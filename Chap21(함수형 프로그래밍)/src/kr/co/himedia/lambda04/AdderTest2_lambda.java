package kr.co.himedia.lambda04;

import java.util.function.Function;

public class AdderTest2_lambda {

	public static void main(String[] args) {
		
		Function<Integer, Integer> myAdder = x -> x + 10;	// 람다식
		int result = myAdder.apply(5);
		System.out.println(result);
		
	}
}
