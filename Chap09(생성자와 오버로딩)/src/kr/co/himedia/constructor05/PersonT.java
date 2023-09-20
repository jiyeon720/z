package kr.co.himedia.constructor05;
//키가 185이고 몸무게가 85킬로인 남성이 있다.이름은 이순신이고 나이는 40세입니다.
public class PersonT {
//이건 쌤이하신거
	public int hight;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public void showInfo() {
		System.out.println("키가"+this.hight+"이고, 몸무게가"+this.gender+"킬로인"+this.gender+"이있습니다.");
		System.out.println("이름은"+this.name+"이고, 나이는"+this.age+"입니다.");
	}
	
	
}
