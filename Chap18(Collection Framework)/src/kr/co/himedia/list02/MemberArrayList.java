package kr.co.himedia.list02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberArrayList {

	// ArrayList 선언
	private ArrayList<Member> arrayList;
	
	// 생성자 - 멤버로 선언한 ArrayList 생성
	public MemberArrayList() {
		arrayList = new ArrayList<>();		//선언한것을 생성
	}
	
	// ArrayList에 멤버 추가 
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 멤버 아이디를 매개변수로 삭제 여부를 반환
	public boolean removeMember(int memberId) {
//		for(int i=0; i<arrayList.size(); i++) {	// 해당 mamberId를 가진 ArrayList에서 찾음
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {			// ArrayList에 있는 멤버아이디가 매개변수의 멤버아이디가 일치 할 경우
//				arrayList.remove(i);			// 해당 멤버 삭제
//				return true;
//			}
//		}
		
		Iterator<Member> ir = arrayList.iterator();
		
//		while(ir.hasNext())
//			System.out.print(ir.next()+"\t");
		
		Member str0;
		while(ir.hasNext()) {
			str0 = ir.next();
			System.out.println(str0 + "\t");
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
		
	}
	
	

	public void showAllMember() {
		for(Member member : arrayList)
			System.out.println(member);
		System.out.println();
	}
	
}



















