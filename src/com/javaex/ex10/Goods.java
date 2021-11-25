package com.javaex.ex10;

public class Goods {
	private String name;
	private int price;

	//생성자
	public Goods(String name, int price) {
	//메모리에 올리는 작업
	this.name = name;
	this.price = price;
	System.out.println("Goods(String name, int price)");
	}
	
	//메소드gs

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
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
		System.out.println("");
	}


	
}
