package kr.co.himedia.nestedgson;

import com.google.gson.Gson;

public class GsonPerAddtoJsonTest {
	
	public static void main(String[] args) {
		
		Address address = new Address("서울", "대한민국");
		Person person = new Person("뚜비", 27,"Admiral@gmail.com", address);
		
		// Person 객체를 -> JSON형태로 바꾸기
		
		Gson gson = new Gson();
		String json = gson.toJson(person);
		 System.out.println("json =" + json);
		
	}
	
}
