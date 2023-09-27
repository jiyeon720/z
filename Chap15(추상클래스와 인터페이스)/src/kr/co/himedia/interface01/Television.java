package kr.co.himedia.interface01;

public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
		
	}
	

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUMN) {
			System.out.println("TV 볼륨의 최대치 값은 10입니다.");
			this.volume = RemoteControl.MAX_VOLUMN;
		}
		else if(volume< RemoteControl.MIN_VOLUMN) {
			System.out.println("TV 볼륨의 최소치 값은 0입니다.");
			this.volume= RemoteControl.MIN_VOLUMN;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 :" + this.volume);

	}


	
}
