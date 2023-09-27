package kr.co.himedia.interface01;

public interface RemoteControl {

	// 상수 (static final 자동 적용됨)
	int MAX_VOLUMN = 10; 
	int MIN_VOLUMN = 0;
	
	// 추상메서드 (abstract 자동 적용됨)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	
	
	
}
