package kr.co.himedia.inheritance05;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerL = new Customer(1000, "Kim");

		customerL.bonusPoint = 1000;
		
		System.out.println(customerL.showInfo());	
		
		
		Customer customerL2 = new VIPCustomer(10000,"주영이");
		// customerL2.				//Customer 클래스의 멤버변수와 메서드만 사용가능
		customerL2.bonusPoint = 10000;
		System.out.println(customerL2.showInfo());
	
		
	}
}
