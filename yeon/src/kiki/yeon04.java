package kiki;
/*
 * 퀴즈 1)
 * 1~10까지 수 중 3의 배수의 개수를 구하여 출력하시오.
 */
public class yeon04 {

	public static void main(String[] args) {
		
		int num;
		int count=0;
		
		for(num = 1; num <= 10; num++) {
			if((num %3) != 0) continue;
			count++;
		}
		System.out.println(count);
	}
}
