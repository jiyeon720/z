package kr.co.himedia.generic03;

public class ObjectArrTest {

	public static void main(String[] args) {
		
		ObjectArr<String> array = new ObjectArr<>(5);
		
		array.set(0, "안뇽");
		array.set(1, "일번");
		array.set(2, "이번");
		array.set(3, "삼번");
		array.set(4, "사번");
		
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		
		}
		
		
	}
	
	
}
