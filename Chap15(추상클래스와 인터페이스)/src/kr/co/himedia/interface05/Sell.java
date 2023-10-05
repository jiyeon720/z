package kr.co.himedia.interface05;

public interface Sell {

	void sell();
	
	default void oder() {
		System.out.println("판매 주문");
	}
}
