package kr.co.himedia.review.review02;

public class InterfaceTest {
	
	public static void main(String[] args) {
		/*
		 * 리모콘으로 Radio와 TV를 동작시키기 
		 * 따로 오버라이드 해서 잘 구동됨
		 * Remocon interface 로 변경 후 
		 *  public void internet();
		 * 
		 * 
		 */
		Remocon remo = new Radio();
		remo.channelUp();
		remo.channelDown();
		remo.volumeUp();
		remo.volumeDown();
		remo.internet();
		
		System.out.println();
		
		remo = new TV();
		remo.channelUp();
		remo.channelDown();
		remo.volumeUp();
		remo.volumeDown();
		remo.internet();
		
	}
}
