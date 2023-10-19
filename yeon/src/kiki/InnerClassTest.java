package kiki;

import kiki.OutClass.InClass;
import kiki.OutClass.InStaticClass;

class OutClass{

	private int num = 10;
	private String name = "외부";
	private static int snum = 20;
	private static String sname = "스테틱외부";
	
	private InClass inClass;


	public OutClass() {
		inClass= new InClass();
	}
	class InClass{
		int innum = 100;
		String inname = "내부";

		void InTest() {
			System.out.println(name + " : "+ num + " : " + sname + " : " + snum);
			System.out.println(inname + " : " + innum);
		}
	}
	public void usingInClass() {
		inClass.InTest();
	}	
	
	static class InStaticClass {
		int stNum = 100;
		static int sttNum = 200;
	
		void inTest() {
			System.out.println("InStaticClass의int : "+ stNum +" \t "+
									"InStaticClass의static int : "+sttNum);
		
		}
		static void sinTest() {
			
			System.out.println("외부의 스테틱 snum : " +snum+" \t "+"외부의 스테틱 sname : "+sname);
			System.out.println("내부의 스테틱 sttNum : "+sttNum);
		}
		
}

}
public class InnerClassTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInClass();
		System.out.println();
		
		OutClass.InClass inClass = outClass.new InClass();
		inClass.InTest();
		System.out.println();
		
		OutClass.InStaticClass instClass = new InStaticClass();
		instClass.inTest();
		System.out.println();
		
		instClass.sinTest();
		System.out.println();
		
		OutClass.InStaticClass.sinTest();
		
		
		
		
		
		
	}
	
}

	
	
