package kr.co.himedia.lambda06;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Himedia";
		
		StringConcat concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		
		
		StringConcat concat2 = (s, v) -> System.out.println(s+","+v);	// 람다식 최신
		concat2.makeString(s1, s2);
		
		
		
		
		
		StringConcat concat3 = new StringConcat() {			// 옛날 스타일
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 +","+ s2);
				
			}
		};
		concat3.makeString(s1, s2);
		
	}
}
