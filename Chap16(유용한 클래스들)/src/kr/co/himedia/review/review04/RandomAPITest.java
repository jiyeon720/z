package kr.co.himedia.review.review04;

import java.util.Random;

public class RandomAPITest {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr = new int[6];

		int i = 0;

		while(i<6) {
			int num = rand.nextInt(45)+1;	//1~45 중의 숫자
			boolean duplicated = false;		//boolean = false/ true 중 선택 false중복안됨

			for(int j=0; j<i; j++) {
				if(arr[j] == num) {		// j는 arr[1]...값을 num과 같은지 확인하기 위함 
					duplicated = true;	// arr[j] == num => true 중복값
					break;				// 멈췃 다시돌아가 
				}
			}

			if(!duplicated) {
				arr[i++] = num;
			}

		}
		for(int numder : arr) {
			System.out.print(numder + " ");

		}


	}
}
