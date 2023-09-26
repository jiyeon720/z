package kr.co.himedia.inheritance03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerL = new Customer(1000, "SILVER", "Kim");

		customerL.bonusPoint = 1000;
		
		System.out.println(customerL.showInfo());		
	
	
		
	}
}
