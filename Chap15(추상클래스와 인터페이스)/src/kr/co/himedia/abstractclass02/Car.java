package kr.co.himedia.abstractclass02;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("시동을 키다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끄다.");
	}
	
	
	final public void run() {			// 코드의 흐름(시나리오).템플릿메서드
		startCar();						// 다른 클래스에서 재정의 못하도록 final 
		drive();
		stop();
		turnOff();
	}
	
	
	
}
