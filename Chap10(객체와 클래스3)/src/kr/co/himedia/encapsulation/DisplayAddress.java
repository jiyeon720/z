package kr.co.himedia.encapsulation;
/*
 * 메서드의 조합으로 결화물을 생성
 */
public class DisplayAddress {

	StringBuffer buffer = new StringBuffer();
	private String line = "====================================\n";
	private String line2 ="------------------------------------\n";
	private String title = "이름\t 주소 \t\t   전화번호   \n";
	
	private void makeHrader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
		
	}
	
	private void makeBody() {
		buffer.append("김지연 \t");
		buffer.append("서울 강동구 \t");
		buffer.append("010-0000-0000 \n");
	
		buffer.append("신사임당 \t");
		buffer.append("경기도 수원시\t");
		buffer.append("010-1234-1235\n");
	}
	
	private void makeFooter() {
		buffer.append(line2);
	}
	
	public String getAddress() {
		makeHrader();
		makeBody();
		makeFooter();
		return buffer.toString();	 // tiString 의 의미 = 문자열
	}
	
}
