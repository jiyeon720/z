package kr.co.himedia.stream05;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');			//문자 하나 출력
			
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf); 			//문자 배열 출력
			
			fw.write(" 굳ദ്ദി˙∇˙)ว ");		//문자열(String)출력
			
			fw.write(buf, 1, 2);		//buf의 1에서2까지 출력
			
			fw.write(" 65 ");			// 숫자를 그대로 출력
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("출력 완료");
		
	}
}
