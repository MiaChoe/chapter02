//2021.11.22(화)10:44-16:34수업_this 추가/2021.11.26(토)/Done_2021.12.14(화)23:18 getter/setter, this.'Field', 'variable'.toString()

package com.javaex.ex04;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {// 메모리에 올리는 작업. 그러나 이 생성자는 밑 생성자 때문에 쓰이지도 않았을 것
		System.out.println("Goods()");
	}

	public Goods(String name, int price) {// 메모리에 올리는 작업
		this.name = name;
		this.price = price;
		System.out.println("Goods(String name, int price)");
	}

	// 메소드 gs
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

	// 메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
}