package kr.co.himedia.goingtoacademy;

public class Student {

	private String studentname;
	private int grade;
	private int money;
	
	public Student(String studentname, int money) {
		this.studentname = studentname;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.ride(1250);
		this.money -= 1250;
		
		
	}
	public void takeSubway(Subway subway) {
		subway.ride(1300);
		this.money -= 1300;
	}
	 public void showInfo() {
	      System.out.println(studentname + "님의 남은 돈은" + money + "원 입니다.");
	}
	
	}
