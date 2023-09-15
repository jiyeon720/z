package kr.co.himedia.loop04;

//1~100까지 숫자 중 3의 배수를 출력하세요.

public class WhileTest {

	public static void main(String[] args) {
	
		int sum = 0;
		int num = 1;	//while문은 초기화 하는 부분이 따로 존재하지 않음
		
		while(num<=100) {	//while문 옆에는 조건식만 들어감
			sum+=num;
			num++;
		}
		
		System.out.println("1~100까지의 합 : "+ sum);
		System.out.println();
		/*
		 * while문은 무한 루프용으로 많이 사용함.
		 * 	-if문, break문과 함께 무한루프를 벗어날 코드를 작성해 줘야함.
		 */
		
		int i=1;
		while(true) {
			System.out.println(i);
			if(i >=100) break;
			i++;
		}
		
	}
}

