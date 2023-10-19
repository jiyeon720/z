package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			int i;	
			while((i = fis.read()) !=-1  )
				System.out.print((char)i);
				
			// 파일에 끝까지 한 바이트씩 자료 읽기 
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
			
		
		System.out.println("end");
		
	}
	
	
}
