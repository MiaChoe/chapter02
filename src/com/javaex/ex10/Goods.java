//2021.11.25(목)수업_Array적용/2021.12.14(화)17:58/Done_2021.12.15(수)06:05 instances belonging to an ArrayList

package com.javaex.ex10;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		//System.out.println("Goods(String name, int price)");
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

	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
		System.out.println("");
	}

}
