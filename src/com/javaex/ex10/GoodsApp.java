//Undone//2021.11.25(목)수업_Array적용/2021.12.14(화)17:58/2021.12.15(수)06:05

package com.javaex.ex10;

public class GoodsApp {

	// 메소드 일반
	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];

		Goods camera = new Goods("니콘", 400000);
		goodsArray[0] = camera;

		Goods cup = new Goods("머그컵", 2000);
		goodsArray[1] = cup;

		Goods computer = new Goods("LG 그램", 900000);
		goodsArray[2] = computer;

		// System.out.println(camera.toString()); goodsArray[0].toString()

		int count = 0;
		for (int i = 0; i < goodsArray.length; i++) {

			if (goodsArray[i] != null)// 주소가 없지 않다면=>주소가 있다면
				System.out.println(goodsArray[i].toString());
			count++;
		}
		System.out.println(count);

		// 이름만 출력하기
		for (int i = 0; i < goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}

	}
}
