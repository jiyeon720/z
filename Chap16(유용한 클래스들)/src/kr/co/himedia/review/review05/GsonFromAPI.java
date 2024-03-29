package kr.co.himedia.review.review05;

import com.google.gson.Gson;

public class GsonFromAPI {

	public static void main(String[] args) {
		String json = "{\"name\":\"이순신\",\"age\":35}";		// JSON - > Person
		
		Gson gson = new Gson();
		Person p = gson.fromJson(json, Person.class);		// 자바 객체로 변환해주는 Gson API
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.toString());

	}
	
	
}
