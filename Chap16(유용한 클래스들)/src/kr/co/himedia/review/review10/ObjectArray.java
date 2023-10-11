package kr.co.himedia.review.review10;

import java.util.Arrays;

public class ObjectArray {

	private final int CASE = 5;	
	private Object[] elements;
	private int size = 0;
	
	public ObjectArray() {
		this(5);
	}
	
	public ObjectArray(int capacity) {
		elements = new Object[capacity];	// 원하는 크기의 배열을 생성함 
	}
	
	public void add(Object element) {
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
	
	public Object get(int index) {	//5,-1
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("inndex의 범위가 초과됨.");
		}
		return elements[index];
	}
	
	
	
}
