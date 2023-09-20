package kr.co.himedia.global03;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeName("이순신");
		
		System.out.println(employee1.getEmployeeName()+ ","+ employee1.getEmployeeId());
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("김지연");
		
		System.out.println(employee2.getEmployeeName()+ ","+ employee2.getEmployeeId());
		
		System.out.println(Employee.serialNum);
		
		Employee employee3 = new Employee();
		employee3.setEmployeeName("오잉");
		
		System.out.println(employee3.getEmployeeName()+","+employee3.getEmployeeId());
		
		System.out.println(Employee.getSerialNum());
		Employee.setSerialName(1004);
		System.out.println(Employee.getSerialNum());
		
		
		
	}								
	
}
