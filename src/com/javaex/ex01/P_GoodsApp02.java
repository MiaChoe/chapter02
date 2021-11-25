package com.javaex.ex01;//2021.11.25(목)19:20복습
/*
[문제]
다음의 데이터를 추가한 후, 출력해 보세요
상품이름 : “니콘”,    가격: 400000
상품이름 : “LG그램”,    가격: 900000
상품이름 : “머그컵”,    가격: 2000
*/
public class P_GoodsApp02 {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		System.out.println(camera.name);
		System.out.println(camera.price);
		System.out.println("___________");
		
		Goods computer = new Goods();
		computer.name = "LG 그램";
		computer.price = 900000;
		System.out.println(computer.name);
		System.out.println(computer.price);
		System.out.println("___________");

		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		System.out.println(cup.name);
		System.out.println(cup.price);
		System.out.println("___________");

	}

}
