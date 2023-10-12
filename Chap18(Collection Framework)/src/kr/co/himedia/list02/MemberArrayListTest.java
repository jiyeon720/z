package kr.co.himedia.list02;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberL = new Member(2023, "주영이");
		Member memberW = new Member(10, "다음주");
		Member memberR = new Member(17, "생일이래요~");
		Member memberS = new Member(5, "5일남았따");
		
		memberArrayList.addMember(memberL);
		memberArrayList.addMember(memberW);
		memberArrayList.addMember(memberR);
		memberArrayList.addMember(memberS);
		
		memberArrayList.showAllMember();
		
		
		
		memberArrayList.removeMember(memberW.getMemberId());
		
		memberArrayList.showAllMember();
		
	}
	
}
