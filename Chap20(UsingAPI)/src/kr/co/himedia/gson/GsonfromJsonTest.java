package kr.co.himedia.gson;

import com.google.gson.Gson;

public class GsonfromJsonTest {

	public static void main(String[] args) {
		
		String json= "{\"name\":\"밥두비\",\"age\":27,\"email\":\"Admiral@gmail.com\"}";
		// JSON형식 -> javaObjec(Member)로 
		Gson gson = new Gson();
		Member memberDTO = gson.fromJson(json, Member.class);
		
		System.out.println("memberDTO =" + memberDTO);
		
		
	}
	
}
// memberDTO =Member [name=밥두비, age=27, email=Admiral@gmail.com]