package kr.co.himedia.array04;

public class TowDimensionTest {

	public static void main(String[] args) {
		int[][]arr = new int[3][3];
		
		int num = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
