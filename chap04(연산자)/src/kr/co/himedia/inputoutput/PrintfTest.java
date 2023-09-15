package kr.co.himedia.inputoutput;

public class PrintfTest {

	public static void main(String[] args) {
		String name = "Admiral Yi";
		int age = 20;
		double height = 185.5;
														// \n = 엔터[다음칸으로 넘어감]
		System.out.printf("%s의 나이는 %d이고, 키는 %f입니다. \n",name, age, height);
											//%.2f는 소수점 뒷자리2자리만 표시됨
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다. \n",name, age, height);
		
								
		
	}

}
