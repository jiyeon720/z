package kr.co.himedia.review.review08;

public class BookTest {

	public static void main(String[] args) {
		
		String[] num = new String[3];
		
		num[0]= "책";
		num[1]= "책1";
		num[2]= "책2";
		num[3]= "책3";
		num[4]= "책4";

		for(int i=0; i<num.length; i++) {			
			String data = num[i];						
			System.out.print(data+" ");
		}
	}
}
