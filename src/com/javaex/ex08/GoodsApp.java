//2021.11.25(목)10:22수업_static

package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());

		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.toString());

		Goods computer = new Goods("LG 그램", 900000);
		System.out.println(computer.toString());

	}

}

/*
 * static <1>메모리에 올라가기도 전에 static에 올라감 <2>메소드 일반 영역에도 붙일 수 있음
 */
