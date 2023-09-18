package kr.co.himedia.userdefinetype02;
//한명의 헬스 클럽 회원 데이터를 저장하고 출력하시오.
//이름, 나이, 전화번호, 이메일, 거주지, 몸무게
public class MemberTest {
	
	public static void main(String[] args) {
		
		Member member = new Member();
	    member.name = "이순신";
	    member.age = 30;
	    member.phone = "010-1234-5678";
	    member.email = "admiral@gmail.com";
	    member.address = "서울";
	    member.weight = "80.6kg";
	    
	    System.out.println(member.name +"\t"+member.age+
	    "\t"+member.phone+"\t"+member.email+"\t"+member.address+"\t"+member.weight);

	}
}
	

