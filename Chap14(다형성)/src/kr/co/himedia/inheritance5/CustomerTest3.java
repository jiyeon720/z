package kr.co.himedia.inheritance5;

import java.util.ArrayList;

// GOLD등급 main

public class CustomerTest3 {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();

		Customer customerL = new Customer(2002309, "김지연");
		Customer customerS = new Customer(202310, "김주영");
		Customer customerG = new GoldCustomer(201401, "주영잉");
		Customer characterC = new GoldCustomer(2021,"골드");
		Customer customerR = new VIPCustomer(2020,"빕");


		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerG);
		customerList.add(characterC);
		customerList.add(customerR);

		System.out.println("=======고객정보 출력=======");
		for(Customer customer : customerList) 

			System.out.println(customer.showInfo());


		System.out.println("=======할인율 계산=======");
		int price = 10000;
		for(Customer customer : customerList )  {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셨습니다.");

		}
		
		
		System.out.println("=======보너스 포인트 계산=======");
		for(Customer customer : customerList) {
			customer.calcPrice(price);
			int point = customer.bonusPoint;
			System.out.println(customer.getCustomerName()+ "님이" + point + "포인트 적립되었습니다.");
			
	
			
			
			
		}
		

		


		
	}

}

