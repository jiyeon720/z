package kr.co.himedia.informationhiding;

public class TimeTest {
	public static void main(String[] args) {
		
		Time time = new Time();
//		time.setHour(-20);
		
		time.setHour(1);
//		System.out.println(time.getHour());
		
		time.setMimute(2);
		
		time.setSecond(30);
		
		
//		System.out.println(time.toString());
		
		System.out.println(time);
		
		
		time.setHour(50);
		time.setMimute(100);
		time.setSecond(100);
		System.out.println(time);
		
	}

}
