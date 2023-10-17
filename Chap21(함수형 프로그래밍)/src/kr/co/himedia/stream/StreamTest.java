package kr.co.himedia.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		Stream<String> strStream = Stream.of("곧","크리스마스가","멀었다","̵ ̭ ̵ ");
		List<String> str = strStream.collect(Collectors.toList());
		System.out.println(str);
		
		String[] cityArray = new String[] {"구","구","단"};
		Stream<String> cityStream = Arrays.stream(cityArray);
		List<String> cityList = cityStream.collect(Collectors.toList());
		System.out.println(cityList);
		
	}
}
