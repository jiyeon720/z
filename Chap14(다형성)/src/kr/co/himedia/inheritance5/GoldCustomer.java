package kr.co.himedia.inheritance5;

public class GoldCustomer extends Customer {

		private int gagentId;
		double gsalesRatio;
		
		public GoldCustomer() {
			super(1100, "아무나");
			this.customerGrade = "GOLD";
			this.bonusRatio = 0.02;
			gsalesRatio = 0.1;
			
			System.out.println("GOLD 생성자 호출");
			
		}
	public GoldCustomer(int customerId, String susromerName) {
		super(customerId, susromerName);
		customerGrade = "GLOD";
		bonusRatio = 0.02;
		gsalesRatio = 0.1;
		
		System.out.println("GoldCustomer(int customerId, String susromerName)생성자 호출") ;

	}
	
	public int getGagentId() {
		return gagentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * gsalesRatio);
	}
	
	
	
}


