package kr.co.himedia.interface08;
/*
 * 인터페이스 활용한 프로그래밍
 * 1) 고객 센터에 전화 상담을 하는 상담원들이 있습니다.
 * 2) 기본적으로 고객에게서 전화가 오면 대기열에 저장되고 각 상담원에게 배분이 됩니다.
 * 3) 배분이 되는 정책은 크게 3가지가 있습니다.
 * 		- 모든 상담원일 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.
 * 		- 쉬고 있거나 할당된 통화 수가 가장 적은 상담원에게 배분합니다.
 * 		- 고객의 등급이 높은 고객은 우수 상담원에게 배분합니다.
 * 4) 위 3가지 정책은 필요에 따라 바뀌어 운영될 수 있습니다.
 */
public interface Distribution {

	void getNextCall();
	void sendCalltoAgent();
	
	
}
