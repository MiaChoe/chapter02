//2021.11.22(화)16:49수업/Done_2021.12.14(화)23:18 getter/setter, this.'Field', 'variable'.toString()

package com.javaex.ex04;

public class GoodsApp {

	// 필드: 생략

	// 생성자: 디폴트 생성자

	// 메소드 gs

	// 메소드 일반
	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());

		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.toString());

	}

}
