package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest6 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			
			// 파일에서 바이트 arr[]로 len만큼 자료를 읽기 (UVWXYZ : 6바이트 읽음<-이런식으로)
			while((i = fis.read(bs, 0, 9)) !=-1) {
				for(int k=0; k<i; k++)
					System.out.print((char)bs[k]);
			
				System.out.println(" : " + i + "바이트 읽음");
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
