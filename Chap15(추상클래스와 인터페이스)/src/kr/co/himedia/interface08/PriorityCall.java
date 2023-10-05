package kr.co.himedia.interface08;

public class PriorityCall implements Distribution{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 Call을 먼저 가져옵니다.");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분합니다.");
		
	}

}
