package kr.co.himedia.singleton02;



public class CaFactoryTest {

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println(Car.getSerialNum());
		
		Car car2 = new Car();
		
		System.out.println(Car.getSerialNum());
	
		
			
		
}
}
