package kr.co.himedia.encapsulation;

public class AddressTest {

	
	public static void main(String[] args) {
		DisplayAddress displayAddress = new DisplayAddress();
		String sbuffer = displayAddress.getAddress();
		
		System.out.println(sbuffer);
		
		
	}
}
