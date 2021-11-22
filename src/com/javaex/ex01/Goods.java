package com.javaex.ex01;//2021.11.21(월)16:13수업//객체지향 프로그래밍 중 3.클래스의 정의 중 메소드
/*
[문제]
Point 클래스를 만드세요
x, y 좌표를 나타낼 수 있는 필드 작성
x, y 좌표에 접근할 수 있는 getter/setter 메소드 작성
다음 실행 결과를 참조하여 draw()메소드 작성
*/


public class Goods {

	//필드 영역
	String name;
	int price;
	
	//메소드 정의하는 영역
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("---------------------");
	}
	
	
}
