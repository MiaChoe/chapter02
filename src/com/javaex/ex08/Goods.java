//2021.11.25(목)10:22수업_static

package com.javaex.ex08;

public class Goods {

	// 핃드
	private String name;
	private int price;
	private int totalCount;

	// 셍성자
	public Goods() {
		this.totalCount++;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalCount++;
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

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}

}
