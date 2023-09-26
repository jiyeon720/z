package kr.co.himedia.array;
/*
 * 퀴즈) char[] 배열에 APPLE이라는 문자로 초기화 하시오.
 * 		대문자로 된 APPLE을 소문자 apple로 출력하시오.
 */
public class CharArrayTest02 {

	public static void main(String[] args) {
		
		char[] ch = {'A','P','P','L','E'};
	
		
		for(int i=0; i<ch.length; i++) {
			
		ch[i] = (char)((int)ch[i]+32);
		
		System.out.print(ch[i]);
	
		}
			
		
		System.out.println();
		
		
		char[] ch2 = {'A','P','P','L','E'};
	
		System.out.print((char)(ch2[0]+32));
		System.out.print((char)(ch2[1]+32));
		System.out.print((char)(ch2[2]+32));
		System.out.print((char)(ch2[3]+32));
		System.out.print((char)(ch2[4]+32));
	
	
		
		
		char[] ch3 = {'A','P','P','L','E'};
		
		for(int i=0; i<ch3.length; i++) {
			System.out.print((int)ch[i]+32);
		}
	}
	
}
