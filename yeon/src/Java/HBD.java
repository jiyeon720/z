package Java;

import java.util.ArrayList;

public class HBD {

	public static void main(String[] args) {
		
		ArrayList<JY> list = new ArrayList<>();
		list.add(new JY(2023, 10, 17, "주영이", "생일이에용"));
		list.add(new JY(2023, 10, 15, "수빈이", "생일이에용"));
		list.add(new JY(2023, 10, 31, "혜민이", "생일이에용"));
		list.add(new JY(2024, 4, 20, "아영이", "생일이에용"));
		list.add(new JY(2024, 2, 6, "재원이", "생일이에용"));
		
		String nname = "주영이";
		for(JY J : list)
			if(J.getName().equals(nname)) {
				System.out.print(J.getYear()+"년 ");
				System.out.print(J.getMonth()+"월 ");
				System.out.print(J.getDay()+"일 ");
				System.out.print(J.getName());
				System.out.print(J.getMm()+ " ♥");
			
				System.out.println();
				
		String sname = "수빈이";
		for(JY SB : list)
			if(SB.getName().equals(sname)) {
				System.out.print(SB.getYear()+"년 ");
				System.out.print(SB.getMonth()+"월 ");
				System.out.print(SB.getDay()+"일 ");
				System.out.print(SB.getName());
				System.out.print(SB.getMm()+ " ♥");
				
			System.out.println();
				
		String hname = "혜민이";
		for(JY HM : list)
			if(HM.getName().equals(hname)) {
				System.out.print(HM.getYear()+"년 ");
				System.out.print(HM.getMonth()+"월 ");
				System.out.print(HM.getDay()+"일 ");
				System.out.print(HM.getName());
				System.out.print(HM.getMm()+ " ♥");
		
				System.out.println();
				
		String aname = "아영이";
		for(JY AY : list)
			if(AY.getName().equals(aname)) {
				System.out.print(AY.getYear()+"년 ");
				System.out.print(AY.getMonth()+"월 ");
				System.out.print(AY.getDay()+"일 ");
				System.out.print(AY.getName());
				System.out.print(AY.getMm()+ " ♥");
				
			System.out.println();
				
		String wname = "재원이";
		for(JY JW : list)
			if(JW.getName().equals(wname)) {
				System.out.print(JW.getYear()+"년 ");
				System.out.print(JW.getMonth()+"월 ");
				System.out.print(JW.getDay()+"일 ");
				System.out.print(JW.getName());
				System.out.print(JW.getMm()+ " ♥");
				
		
				
				
			}	
			}
			}
			}
			}
		
	}
}
