package kr.co.himedia.inheritance03;

public class VIPCustomer extends Customer {
	
	private int agentId;
	double salesRatio;
	
	public VIPCustomer() {
		super(1000, "Kim", "SLIVER");				//기본생성자 없는경우 Customer의 생성자 호출방법임.
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	
	
	

	public int getAgentId() {
		return agentId;
	}
	
	
	
	
	
	
}
