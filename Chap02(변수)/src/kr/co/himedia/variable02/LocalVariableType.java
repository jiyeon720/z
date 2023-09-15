package kr.co.himedia.variable02;

public class LocalVariableType {

	public static void main(String[] args) {
		
		var i = 20;
		var j = 10.0;
		var str = "himedia";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "hi himedia";
		//안됨 : str = 100;
	}
}
