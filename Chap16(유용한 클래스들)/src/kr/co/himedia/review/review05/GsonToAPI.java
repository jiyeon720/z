package kr.co.himedia.review.review05;

import com.google.gson.Gson;

public class GsonToAPI {

	
	public static void main(String[] args) {
		
		Person person = new Person("이순신", 35);		
		Gson gson = new Gson();
		String json = gson.toJson(person);			//JSON형식으로 변환해주는 Gson API
		System.out.println(json);
	}
}
