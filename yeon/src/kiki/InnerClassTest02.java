package kiki;

import kiki.OutClass2.InClass;

class OutClass2 {
	private String name = "OutClass : ";
	private int num = 100; 
	private static String sname = "static OutClass : ";
	private static int snum = 1000;

	private InClass inClass;

	public OutClass2() {
		inClass = new InClass();
	}
	class InClass{
		String inname = "InClass :";
		int innum = 10;

		void InTest() {
			System.out.println(name + num);
			System.out.println(sname + snum);
			System.out.println(inname + innum );
		}
	}
	
	
	public void usingInClass(){
		inClass.InTest();
	}
	
	
	static class StaticClass {
		static String stcName = "InClass의 StaticClass의 static : ";
		static int stcNum = 100;
		String scName = "InClass의 StaticClass : ";
		int scNum = 500;
		
		void SInTest() {
			System.out.println(stcName + stcNum);
			System.out.println(scName + scNum);	
		}
		
		
		
		static void StInTest() {
			System.out.println(stcName + stcNum);
//			System.out.println(scName + scNum);	안댐
		}
		



	}

	}

	public class InnerClassTest02 {

		public static void main(String[] args) {
			OutClass2 outClass2 = new OutClass2();
			outClass2.usingInClass();
			System.out.println();
			
			OutClass2.InClass inClass = outClass2.new InClass();
			inClass.InTest();
			System.out.println();
			
			OutClass2.StaticClass staticClass = new OutClass2.StaticClass();
			staticClass.SInTest();
			System.out.println();
			
			staticClass.StInTest();
			System.out.println();
			
			
			OutClass2.StaticClass.StInTest();
		
			

		}

			
	}
