package kr.co.himedia.generic06;

public class AverageCalculatorTest {

	public static void main(String[] args) {
		
		Integer[] integers = {6, 7, 8, 9, 10};
		
		AverageCalculator<Integer> intgerCalculator = new AverageCalculator<>(integers);
		double intgerAverage = intgerCalculator.calculateAverage();
		System.out.println(intgerAverage);
		
		Double[] Doubles = {6.0, 7.0, 8.0, 9.0, 10.0};
		
		AverageCalculator<Double> DoublesCalculator2 = new AverageCalculator<>(Doubles);
		double intgerAverage2 = DoublesCalculator2.calculateAverage();
		System.out.println(intgerAverage2);
		
	}
	
}
