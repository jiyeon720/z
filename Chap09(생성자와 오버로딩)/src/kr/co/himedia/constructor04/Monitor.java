package kr.co.himedia.constructor04;

public class Monitor {

	//멤버변수(필드)
	String color;
	
	int channel;		//채널
	int volume;			//볼륨
	boolean power;		//전원(on/off)
	
	// 멤버메서드 
	public void power() {	//power 메서드 호출하는겨
		if(!power) { // 값자체는 트루
			System.out.println("모니터가 켜졌습니다.");
			this.power = !power; //거짓인거 임 암튼그런거임
		}else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;
		}
	}
	
	public void channe1Up() {
		this.channel++;
		System.out.println("현재 채널 : " + this.channel);
	}
	
	public void channelDown() {
		System.out.println("현재 채널 : " + --(this.channel));
		
	}

	@Override
	public String toString() {
		return "Monitor [color=" + color + ", channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	
}
