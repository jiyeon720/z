package kr.co.himedia.array04;

public class StringArrayTest {
	
	public static void main(String[] args) {
		
		String[] name = new String[7];
		
		name[0] = new String("지요닝");
		name[1] = new String("지요닝1");
		name[2] = new String("지요닝2");
		name[3] = new String("지요닝3");
		name[4] = new String("지요닝4");
		name[5] = new String("지요닝5");
		name[6] = new String("지요닝6");
	
		int strlength = 0;
		for(int i=0; i<name.length; i++) {
//			System.out.println(name[i].toString());
			strlength += name[i].length();
		}
		System.out.println("총 문자의 수 :"+ strlength);
		
		
		
		
}
	
}
