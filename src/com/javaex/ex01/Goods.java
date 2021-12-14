//2021.11.21(월)16:13수업_클래스의 정의 중 메소드/Done_2021.12.14(화)23:05 field, reference variable, instance variable, getter/setter,'variable'.set'Field'(field value);

package com.javaex.ex01;

public class Goods {

	// 필드 영역
	String name;
	int price;

	// 메소드 정의하는 영역
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("--------------------");
	}

}
