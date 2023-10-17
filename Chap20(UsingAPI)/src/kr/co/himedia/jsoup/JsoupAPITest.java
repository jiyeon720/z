package kr.co.himedia.jsoup;
// view-source:https://sum.su.or.kr:8888/bible/today 의 속성으로 작성함
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupAPITest {

	public static void main(String[] args) {
		String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023-10-14";
									//?base_de=2023-10-14 날짜 변경 날짜의 이름 설정을 base_de로 해놓은것을 불러냄
		try {						//예외처리 "https://sum.su.or.kr:8888/bible/today"이 접속 안될경우
			Document document = Jsoup.connect(url).get();
			Element bibletext = document.getElementById("bible_text");
			Element bibleinfobox = document.getElementById("bibleinfo_box");
			Element bodylist = document.getElementById("body_list");
			Elements num = document.select(".num");
			Elements info = document.select(".info");
			
			for(int i=0; i<num.size(); i++)
				System.out.println(num.get(i).text() + ":" + info.get(i).text());
			
			System.out.println();
			System.out.println("bibletext =" + bibletext.text());
			System.out.println();
			System.out.println("bibleinfobox =" + bibleinfobox.text());
			System.out.println();
			System.out.println("bodylist =" + bodylist.text());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
