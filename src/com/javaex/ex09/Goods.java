package com.javaex.ex09;//2021.11.25(목)10:22수업,static

public class Goods {

	//핃드
	private String name;
	private int price;
	private static int totalCount;
	
	
	//셍성자
	public Goods() {
		this.totalCount++;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalCount++;
	}
	
	//메소드-getter/setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPrice() {
		return price;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public String getTotalCount() {
		return totalcount;
	}

	
	
	
	//메소드=일반
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getTotalCount()=" + getTotalCount() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
