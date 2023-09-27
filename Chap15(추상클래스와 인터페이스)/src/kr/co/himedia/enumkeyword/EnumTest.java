package kr.co.himedia.enumkeyword;

enum Human { MAN, WOMAN }
enum Machine { CAR, AIRPLANE }

public class EnumTest {

	public static void main(String[] args) {
		
		createUnit(Machine.CAR);
//		createUnit(Human.MAN); 			=>	에러, 잘못된 사용을 사용함	
//		if(Human.MAN == 0) {	}		=>  숫자로 비교하면 에러가 남.
		
	}

	public static void createUnit(Machine Kind) {
		switch(Kind) {
		case CAR:
			System.out.println("자동차를 만듭니다.");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}
		
	}
	
}
