package kr.co.himedia.lambda07;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(2.2,3.3,4.4);
		BiConsumer<Integer, Double> biConsumer = (index, input) -> 
								System.out.println("두개 입력갑 처리 : " + input +"," +"인덱스 번호 : "+ index);
		spend(list, biConsumer);
								
								
	}
	public static<T> void spend(List<T> inputs, BiConsumer<Integer, T> biConsumer) {
		for(int i=0; i<inputs.size(); i++)
			biConsumer.accept(i, inputs.get(i));
		
		


	}
}
