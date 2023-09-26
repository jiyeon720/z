package kr.co.himedia.singleton02;



public class CaFactoryTest {

	public static void main(String[] args) {
		
		CarFactory carFactory = CarFactory.getInstance();
		Car bmwiX1 = carFactory.createCar();
		Car bmwiXM60 = carFactory.createCar();
		
		System.out.println(bmwiX1.getCarNum());
		System.out.println(bmwiXM60.getCarNum());
		
//		
//		Car car = new Car();
//		
//		System.out.println(Car.serialNum);
//		
//		Car car2 = new Car();
//		
//		System.out.println(Car.serialNum);
//	
//		
			
		
}
}
