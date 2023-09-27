package kr.co.himedia.abstractclass02;

public class SelfConerolCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전.");
		System.out.println("사람이 핸들 조작.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크밟아서 정지.");
		
	}

	
	
}
