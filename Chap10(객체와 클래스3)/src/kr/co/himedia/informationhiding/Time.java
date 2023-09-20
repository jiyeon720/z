package kr.co.himedia.informationhiding;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	
	
	//getter
	 
	
	
	

	public int getHour() {
		return hour;
	}
	
		
	
	

	public void setHour(int hour) {
		if(hour < 0 || hour >23 ) {
			System.out.println("시간을 잘못입력하셨습니다.");
			return;
		}	
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	
	}

	public void setMimute(int minute) {
		if(minute <0 || minute > 59) {
			System.out.println("잘못함");
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second <0 || second > 59) {
			System.out.println("잘못함박스테이크");
			return;
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour()+"시"+
				this.getMinute()+"분"+
				this.getSecond()+"초 입니다.";
	
		
	
	}
}
