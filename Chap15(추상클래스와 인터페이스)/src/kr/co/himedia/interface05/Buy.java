package kr.co.himedia.interface05;

public interface Buy {

	void buy();
	
	default void oder() {
		System.out.println("구매 주문");
	}
}
