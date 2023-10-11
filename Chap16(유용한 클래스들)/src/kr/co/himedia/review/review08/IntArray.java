package kr.co.himedia.review.review08;
//책[book] 3권을 배열에 저장하고 출력하시오.
import java.util.Arrays;

public class IntArray {
	
	private final int DEEAULT_CAFACITY = 5;	//상수
	private int[] elements;
	private int size = 0;
	
	// 생성 동작 
	public IntArray() {
		elements = new int[DEEAULT_CAFACITY];	//5개 크기 배열 	
	}
	
	// 저장 동작 
	public void add(int element) {
		if(size == elements.length) {	// 꽉 찻을 경우
			// 배열의 크기를 2배로 늘리고 요소값은 복사 => upgradeArray();
			upgradeArray();
		}
			
		elements[size++] = element;
	}
	public void upgradeArray() {
		int newCapacity = elements.length * 2;	//2배로 늘리기
		elements = Arrays.copyOf(elements, newCapacity); 	// copyOf => 요소값 복사 
	}

	// 길이를 구하는 동작 (원소의 개수) 
	public int size() {
		return size;
	}
	
	// 데이터를 얻는 동작 
	public int get(int index) {
		// 
		return elements[index];
	}	
	
	
}
