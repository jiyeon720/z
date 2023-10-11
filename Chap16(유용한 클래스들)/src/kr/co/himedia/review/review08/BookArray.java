package kr.co.himedia.review.review08;

import java.util.Arrays;

public class BookArray {

	private final int CASE = 5;	
	private Book[] elements;
	private int size = 0;
	
	public BookArray() {
		elements = new Book[CASE];
	}
	public void add(Book element) {
		if(size == elements.length) {
			upgradeArray();
		}
		elements[size++] = element;
	}
	private void upgradeArray() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
		
	}
	public int size() {
		return size;
	}
	
	public Book get(int index) {	//5,-1
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("inndex의 범위가 초과됨.");
		}
		return elements[index];
	}
//	public void add(int i) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
