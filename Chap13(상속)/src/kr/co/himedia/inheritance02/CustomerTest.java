package kr.co.himedia.inheritance02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerL = new Customer();
		customerL.setCustomerName("김지연");
		customerL.setCustomerId(20230926);
		customerL.bonusPoint = 1000;
		
		System.out.println(customerL.showInfo());		
		System.out.println(); 
		
		VIPCustomer customerS = new VIPCustomer();
		customerS.setCustomerName("김주영");
		customerS.setCustomerId(202310);
		customerS.bonusPoint = 10000;
		
		System.out.println(customerS.showInfo());
		
		
		
		
	}
}
