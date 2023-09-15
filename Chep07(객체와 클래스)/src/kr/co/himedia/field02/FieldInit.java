package kr.co.himedia.field02;

import java.util.Arrays;

public class FieldInit {

	// 기본형
	byte byteField;			//1byte
	short shortField;		// 2byte
	int intField; 			// 4byte
	long lingField; 		// 8byte
	
	boolean booleanField; 	//1byte
	char charField; 		// 2byte
	
	float floatField; 		// 4byte
	double doubleField;		// 8byte
	
	// 참조형
	String strField;		// 4byte
	int[] arrField; 		// 4byte
	
	@Override
	public String toString() {
		return "FieldInitTest [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", lingField=" + lingField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floarField=" + floatField + ", doubleField=" + doubleField + ", strField=" + strField
				+ ", arrField=" + Arrays.toString(arrField) + "]";
	}
	
	
}
