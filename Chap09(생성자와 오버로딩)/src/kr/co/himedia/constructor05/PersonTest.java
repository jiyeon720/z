package kr.co.himedia.constructor05;
//키가 185이고 몸무게가 85킬로인 남성이 있다.이름은 이순신이고 나이는 40세입니다.
public class PersonTest {
//이건 지연이가 한거
	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println();
		
		p.height = 185;
		p.weight = 85;
		p.name = "이순신";
		p.age = 40;
		
		System.out.println("키가"+p.height+"이고, 몸무게가"+p.weight+
				"킬로인 남성이 있다. 이름은"+p.name+"이고, 나이는"+p.age+"입니다.");
		
		
	}
}
