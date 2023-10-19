package kr.co.himedia.stream06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;					//	└>문자변환					└>파일자료 읽어들이기	
			while( (i = isr.read()) !=-1)
				System.out.print((char)i);
				
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
}
