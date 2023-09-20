package kr.co.himedia.this0;

public class Car /* extends Object 가 숨어있어용?*/{

	private String color;
	private String gearType;
	private int door;
	
	
	public Car() {
		//super();
		//개발자가 직접적으로 인스턴스 멤버변수를 초기화한거임
//		this.color = "흰색";
//		this.gearType = "수동";
//		this.door = 4;
		
		this("블랙", "자동", 5);
		
	}


	public Car(String color, String gearType, int door) {
//		super();
		this.color = color;						// 멤버변수 초기화했어용 
		this.gearType = gearType;
		this.door = door;
	}


	@Override
	public String toString() {
		return this.color +","+this.gearType+","+this.door;
	}
	
	
	
	
	
}
