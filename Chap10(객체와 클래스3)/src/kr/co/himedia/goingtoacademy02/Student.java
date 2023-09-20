package kr.co.himedia.goingtoacademy02;

import javax.print.DocFlavor.STRING;

/*
 * - 이순신은 지각을 해서 택시를 타야 했습니다.
 *        	20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
 *        	택시는 '하이운수' 회사 택시를 탔습니다.
 *        
 * - 이순신님의 남은 돈은 10000원 입니다.
 *   하이택시 수입은 10000원 입니다.
 */
public class Student {
	
	private String name;
	private int money;
	
	public Student(String name, int money) {
		
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.ride(10000);
		this.money -= money;
	
	}
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
		
	}
	
	
	
}
