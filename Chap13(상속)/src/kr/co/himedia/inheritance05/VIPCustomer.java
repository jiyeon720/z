package kr.co.himedia.inheritance05;

public class VIPCustomer extends Customer {
	
	private int agentId;
	double salesRatio;
	
	public VIPCustomer() {
		super(1000, "Kim");				//기본생성자 없는경우 Customer의 생성자 호출방법임.
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	public VIPCustomer(int customreId, String customerName) {
		super(customreId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int customreId, String customerName) 생성자 호출");
	}
	
	
	
	

	public int getAgentId() {
		return agentId;
	}
	
	@Override								// ctrl + sp 사용해서 오버라이드 하면 편함 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * salesRatio);			// 세일계산
	}



	
	
	
}
