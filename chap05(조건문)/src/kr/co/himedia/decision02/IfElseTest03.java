package kr.co.himedia.decision02;

import java.util.Scanner;

public class IfElseTest03 {
	
	public static void main(String[] args) {
		/*
		 * 퀴즈1)
		 * 	정수 1개를 입력 받아 짝수인지 홀수 인지를 판단하는 프로그램을 작성하시오.
		 * 		- 정수를 입력하세요. : 20
		 * 			짝수입니다.
		 * 
		 * 		- 정수를 입력하세요 : 21
		 * 			홀수입니다.
		 */
		
		
		Scanner scan = new Scanner(System.in);


		System.out.print("숫자 :");
		int num = scan.nextInt();
		
		if(num%2 ==0) {
			System.out.println("짝수입니당.");
		}else {
			System.out.println("홀수입니다람쥐.");
		}
		
		
		
		/* 퀴즈2
		 * 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하시오.
		 */
		scan = new Scanner(System.in);
		
		System.out.print("숫자 :");
		int num2 = scan.nextInt();
		
		if(num2 %12 == 0) {
			System.out.println("12배수임.");
		}else {
			System.out.println("12배수아님.");
		}
		
		/*
		 * 퀴즈3
		 * 년도를 입력받아서 해당 년도가 윤년인지 아닌지를 판단하여
		 * 출력하는 프로그램을 작성하시오.
		 * - 윤년[4의 배수인 년도(100으로 나누어 떨어지는 년도를 제외하고)와 400의 배수인 년도]
		 * 
		 */
		
		scan = new Scanner(System.in);
		
		System.out.print("년도 :");
		int num3 = scan.nextInt();
		
		if((num3 %4 == 0 && num3%100 !=0) || ( num3 %400 == 0)){
			System.out.println("윤년임.");
		}else {
			System.out.println("윤년아님");
		}
		
		
		
		
		scan.close();
		
		
		
	}
}
