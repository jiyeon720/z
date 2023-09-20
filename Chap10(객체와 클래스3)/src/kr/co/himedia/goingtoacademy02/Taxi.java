package kr.co.himedia.goingtoacademy02;
/*
 * - 이순신은 지각을 해서 택시를 타야 했습니다.
 *        	20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
 *        	택시는 '하이운수' 회사 택시를 탔습니다.
 *        
 * - 이순신님의 남은 돈은 10000원 입니다.
 *   하이택시 수입은 10000원 입니다.
 */
public class Taxi {

	private String companyName;
	private int money;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	public void ride(int money) {
		this.money =+ money;
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName+"택시 수입은"+money+ "원 입니다.");
	}
	
}
