package kr.co.himedia.member;

public class Student {

	public int studenID;
	public String studenName;
	public String address;
	
	public void showStudenInfo() {
		System.out.println(studenName +"," + address);
	}
	public String getStudenName() {
		return studenName;
	}
	
}
