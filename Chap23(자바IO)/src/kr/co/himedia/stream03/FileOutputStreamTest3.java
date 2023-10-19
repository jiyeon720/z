package kr.co.himedia.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output3.txt");
		
		try(fos) {
			String st = " ";
			byte[] bs = new byte[26];
			byte data = 65;			//'A'의 아스키 코드 값(65)
			for(int i=0; i<bs.length; i++)
				bs[i] = data++;
				
			//fos.write(bs); 			//배열 한꺼번에 출력하기 
			
			fos.write(bs, 2, 10 );
			
			
			fos.write(67);		//노가다버전
			fos.write(68);		
			fos.write(69);
			fos.write(70);
			fos.write(71);
			fos.write(72);
			fos.write(73);
			fos.write(74);
			fos.write(75);
			fos.write(76);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
		
	}
	
}














