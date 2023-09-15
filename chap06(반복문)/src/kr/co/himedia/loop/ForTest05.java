package kr.co.himedia.loop;

public class ForTest05 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + " ");
		}
		System.out.println("============");
		//퀴즈1> 알파벳 대문자와 아스키 코드 값을 출력해보거라
		/*
		 * A : 65
		 * B : 66
		 * C : 67
		 * .
		 * .
		 * .
		 * Z : 90
		 */
		
		
		
		for(char i='A'; i<='Z'; i++ ) {
			
			System.out.println(i + " : "+(int)i  );
		}
		
		
		System.out.println();
		
		
		for(char i='a'; i<='z'; i++ ) {
			
			System.out.println(i + " : "+(int)i  );
		}
		System.out.println();
			
			
		for(int c=65; c<=90; c++ ) {
			
			System.out.println((char)c + ":"+c  );
		}
		
		
		
		
		
		
	}

}
