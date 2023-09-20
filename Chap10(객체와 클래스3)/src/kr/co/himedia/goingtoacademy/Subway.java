package kr.co.himedia.goingtoacademy;

public class Subway {

	private int lineNumber;
	private int passngerCount;
	private int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void ride(int money) {
		this.money += money;
		this.passngerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber+"호선 지하철의 승객은"+passngerCount+"명이고, 수입은"+money+"입니다.");
	}
}
