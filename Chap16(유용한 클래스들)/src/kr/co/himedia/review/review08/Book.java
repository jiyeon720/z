package kr.co.himedia.review.review08;

import java.util.Arrays;

//책[book] 3권을 배열에 저장하고 출력하시오.
public class Book {

	private String title;
	private int price;
	private String comperny;
	private String author;
	
	public Book() {}
	
	public Book(String title, int price, String comperny, String author) {
		this.title= title;
		this.price= price;
		this.comperny=comperny;
		this.author = author;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getComperny() {
		return comperny;
	}

	public void setComperny(String comperny) {
		this.comperny = comperny;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
			return "Book title=" + title + ", price=" + price +
					", comperny ="+ comperny+", author=" + author+"";
		
	}

	
	
	
	
}
