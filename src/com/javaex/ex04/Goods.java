package com.javaex.ex04;//2021.11.22(화)16:34수업,디폴트생성자와 복수개의생성자들을 자동으로 만들어주는 생성자using fields

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Goods() {
	//메모리에 올리는 작업	
	}

	
	
	public Goods(String name, int price) {
	//메모리에 올리는 작업
	this.name = name;
	this.price = price;
	}
	
	
	//메소드 중 getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 중 일반

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
}


