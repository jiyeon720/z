package kr.co.himedia.loop05;

import java.util.Scanner;

/*			char
 * 퀴즈1
 *	 	메세지를 입력하세요.
 * 		프로그램을 종료하려면,q를 입력하세요.
 * 
 *		>하이미디어
 *		입력받은 메세지 : 하이미디어
 *		>천호역
 *		입력받은 메세지 : 천호역
 *		>q
 *		입력받은 메세지 : q
 *		프로그램 종료함.
 */
public class DoWhileTest02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요. ");
		System.out.println("프로그램을 종료하려면,q를 입력하세요.");
		
		String str = null;
	
		do {
			System.out.print(">");
			str = scanner.nextLine();
			System.out.println("입력받은 메세지" + str);
			}while (!str.equals("q"));
		
		System.out.println("프로그램을 종료합니다.");
		
		
		scanner.close();
		
	}
}
