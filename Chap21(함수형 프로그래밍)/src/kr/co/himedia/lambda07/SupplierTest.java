package kr.co.himedia.lambda07;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<String> mySupplier = () -> "안뇽?";
		System.out.println(mySupplier.get());
		
		Supplier<Double> mySupplier2 = () -> Math.random();
		System.out.println(mySupplier2.get());
		
		System.out.println();
		
		
		
		
		printRandomDouble(mySupplier2, 3);
	}
	
	public static void printRandomDouble(Supplier<Double> supplier,int count) {
		for(int i=0; i<count; i++)
			System.out.println(supplier.get());
	}
}
