package kr.co.himedia.loop02;

import java.util.Scanner;

/*
 * 구구단을 출력
 * 몇단부터 출력하실? :  (입력 3)
 * 끝 단은 얼마임? : 	(입력 5)
 * 
 * ================3단==========
 * 
 * 3*1=3
 * 
 * 
 */
public class NestedLoopTest03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구구단을 출력합니다.");
		System.out.println("몇단부터 출력할까요? : ");
		int start = scanner.nextInt();
		
		System.out.println("끝 단은 얼마인가요? : ");
		int end = scanner.nextInt();
		
		
		for(; start <= end; start++) {
			System.out.println("======" +start+'단'+ "======");
			for(int j=1; j<10; j++) {
				System.out.println(start + "X"+j+"="+ (start*j));
				
			}
			
		}
		
		
	}
}
