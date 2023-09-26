package kr.co.himedia.inheritance05;

public class CustomerTest02 {

	public static void main(String[] args) {
		
		Customer customerL = new Customer(2023, "김지연");
		customerL.bonusPoint = 1000;
		int priceL = customerL.calcPrice(10000);
		System.out.println(customerL.showInfo() + "지불 금액은 " + priceL + "원 입니다.");
		
		System.out.println();
		
		
		// 참조변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer임 기준은 Customer
		Customer customerS = new VIPCustomer(2024,"김주영");
		customerS.bonusPoint = 10000;
		int priceS = customerS.calcPrice(10000);
		System.out.println(customerS.showInfo() + "지불 금액은 " + priceS + "원 입니다.");
		
	}
}

