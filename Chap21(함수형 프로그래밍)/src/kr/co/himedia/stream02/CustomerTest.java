package kr.co.himedia.stream02;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerL = new Customer("뚜비", 40, 100);
		Customer customerN = new Customer("혬찌", 20, 100);
		Customer customerG = new Customer("아용", 13, 50);
		
		List<Customer> customersList = new ArrayList<>();
		customersList.add(customerL);
		customersList.add(customerN);
		customersList.add(customerG);
		
		
		
		System.out.println("=====고객 명단 추가된 순서대로 출력하기=====");
		//map(), foEach()
		customersList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println();
		
		int total = customersList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 " + total +"만원 입니다.");
		System.out.println();
		
		System.out.println("=====20세 이상 고객 명단 정렬하여 출력하기=====");
		customersList.stream().filter(c -> c.getAge()>=20).map(c -> c.getName()).sorted().
																			forEach(s ->System.out.println(s));
		
		System.out.println("=====20세 미만 고객 명단 정렬하여 출력하기=====");
		customersList.stream().filter(c -> c.getAge()<20).map(c -> c.getName()).sorted().
																			forEach(s -> System.out.println(s));
		
		
		
	}
}











