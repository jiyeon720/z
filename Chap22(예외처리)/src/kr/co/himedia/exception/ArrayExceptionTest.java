package kr.co.himedia.exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
/*		for(int i=0; i<=5; i++)	/*	i<=5;	java.lang.ArrayIndexOutOfBoundsException/
												잘못된 인덱스를 사용하여 배열에 액세스했음을 나타내기 위해 발생합니다. 
														인덱스는 음수이거나 배열 크기보다 크거나 같습니다.*/
		try {		//try ~ catch 문
			for(int i=0; i<=5; i++)			
				System.out.println(arr[i]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리함");
		}
		
		
		System.out.println("프로그램 정상 종료");
	}
}
