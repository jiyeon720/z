package kr.co.himedia.singleton02;

/*
 * 자동차 공장이 있습니다.
 * 자동차 공장은 유일한 객체이고,
 * 이 공장에서 생산되는 자동차는 생산될 때마다 고유의 차번호가 부여됩니다.
 * 
 * 자동차 번호가 1001번부터 시작되어 차가 생산될 때마다
 * 1002,1003번 증가하여 부여 되도록하세요 /자동차 공장 클래스(싱글톤패턴),자동차 번호(클래스 static변수) 를 구현하세요
 * 
 * - 출력예시
 * 		1001
 * 		1002
 */

public class Car {

	public static int serialNum = 1000;
	private int CarNum;
	
	public Car() {
		serialNum++;
		CarNum = serialNum;
	}
	
	

	public int getCarNum() {
		return CarNum;
	}

	public void setCarNum(int carNum) {
		CarNum = carNum;
	}
	
	
	
	
	
//private String CarString;
//	
////	public Car() {
////	Car.serialNum++;
////	this.CarId = serialNum;
////

	
	
	}












