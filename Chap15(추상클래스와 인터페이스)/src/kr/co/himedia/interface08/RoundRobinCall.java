package kr.co.himedia.interface08;

public class RoundRobinCall implements Distribution{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");
		
	}

}
