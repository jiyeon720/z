package kr.co.himedia.global02;

public class Employee {

	public static int serialName = 1000;
	private int employeeId;
	private String employeeName;
	
	
	public static int getSerialName() {
		return serialName;
	}

	public static void setSerialName(int serialName) {
		Employee.serialName = serialName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private String department;
		
	public Employee() {
		Employee.serialName++;
		this.employeeId = serialName;
	}
	
}