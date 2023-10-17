package kr.co.himedia.gson;

import com.google.gson.Gson;

public class GsontoJsonTest {

	public static void main(String[] args) {
		
		Member memberDTO =new Member("밥두비", 27, "Admiral@gmail.com");
		// JSON -> {"name":"밥두비", ......}
		Gson gson = new Gson();
		String json = gson.toJson(memberDTO);
		System.out.println("json = " + json);
		
		
		
	}
	
}
//json = {"name":"밥두비","age":27,"email":"Admiral@gmail.com"}