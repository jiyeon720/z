package kr.co.himedia.loop02;

//********
//*******
//******
//*****
//****
//***
//**
//*



public class TriangleTest {

	public static void main(String[] args) {
		int x = 1;
		int y = 8;
		
		
		for (int i=1; i<=8; i++) {
				for (int j=1; j<=8; j++) {
				if(j <y ) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
				
		}
		System.out.println();
		x++;
		y--;
		
	}
}
		
		
		
	}

