package kr.co.himedia.abstractclass02;

public class CarTest {

	public static void main(String[] args) {
		
		Car aicar = new AICar();
		aicar.run();
		System.out.println();
		
		Car scCar = new SelfConerolCar();
		scCar.run();
		
		




	}
}