package kr.co.himedia.inheritance03;

public class Customer {

	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	


	public Customer(int customerId, String customerGrade, String customerName ) {
		super(); //생략가능
		this.customerId = customerId;
		this.customerGrade = customerGrade;
		this.customerName = customerName;
		
	}

	
	
	
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	

	public String showInfo() {
		return customerName + "님의 등급은" + customerGrade +
								"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
	
	
	
	
	
}









