package com.javaex.ex01;//Done//2021.11.26(금)00:28복습
/*
[문제]
Goods 클래스를 만드세요
	1) 필드접근자를 private로 작성해서 외부에서 접근할 수 없게 합니다.
	2) 필드에 값을 저장할 수 있도록 set메소드를 만드세요.
	3) 필드에 값을 읽을 수 있도록 get메소드를 만드세요.
	4) 아래와 같이 상품의 모든 정보를 출력해 주는 showInfo()를 만드세요.
*/
public class _GoodsApp_P03 {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods computer = new Goods();
		computer.setName("LG Gram");
		computer.setPrice(900000);
		computer.showInfo();
		
		Goods cup = new Goods();
		cup.setName("Mug Cup");
		cup.setPrice(2000);
		cup.showInfo();
		
	}

}
