package kr.co.himedia.operator02;

import java.util.Scanner;

public class ConditionOperTest02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수(정수)를 입력하세요:");
		int score = scan.nextInt();
		
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println("당신의 등급 :" + grade);
		
		//삼항연산자 중첩
		grade = ((score >= 90) ? 'A' : ((score > 80) ? 'B' : 'C'));
		System.out.println("당신의 등급 :" + grade);
		
		
		
	
		
		
		scan.close();
		
				
		
	}
}
