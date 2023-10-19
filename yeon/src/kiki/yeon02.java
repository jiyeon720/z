package kiki;

public class yeon02 {




//*   *		3칸
// * *		1칸
//  *		
// * *		1칸
//*   *		3칸


	public static void main(String[] args) {
		int x = 1;
		int y = 5;
		
		
		for (int i=1; i<=5; i++) {
				for (int j=1; j<=5; j++) 
				if(j>y || j>x ) {
					System.out.print("*"); {
							System.out.print(" ");
				}
				if (j==y || j==x ) {
							System.out.print("*");
				}
				
		
		System.out.println();
		x++;
		y++;
				}
		}
	}
}


	