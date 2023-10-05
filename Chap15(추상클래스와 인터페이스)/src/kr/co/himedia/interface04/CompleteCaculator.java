package kr.co.himedia.interface04;

public class CompleteCaculator extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0)
			return ERROR;
		else
			return num1 / num2;
	}
	
	
	public void showCalcInfo() {
		System.out.println("모두 구현한 상태입니다.");
	}

	@Override
	public void description() {
		System.out.println("CompleteCaculator에서 재정의함 디폴트 메서드");
		}
	
	
	
	
}
