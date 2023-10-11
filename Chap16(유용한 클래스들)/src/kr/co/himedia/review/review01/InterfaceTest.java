package kr.co.himedia.review.review01;

public class InterfaceTest {
	
	public static void main(String[] args) {
		/*
		 * 리모콘으로 Radio와 TV를 동작시키기 
		 * 따로 오버라이드 해서 잘 구동됨
		 * Remocon의 public void internet() {
		System.out.println("인터넷이 연결된다.");
		} 는 오버라이드 안한것
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
