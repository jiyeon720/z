package kr.co.himedia.goingtoacademy02;

public class Academy {

	public static void main(String[] args) {
		
		Student student = new Student("김지연", 20000);
		Taxi taxi지연운수 = new Taxi("지연운수");
		
		student.takeTaxi(taxi지연운수);
		
		student.showInfo();
		
		taxi지연운수.showTaxiInfo();
	}
	
}
