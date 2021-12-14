//Done/2021.11.24(수)14:42_3.클래스의 정의 중 메소드오버로딩/Done/2021.12.14(화)17:11_minipro 설명하시다가 나온 예시라 복습/2021.12.14(화)22:30

package com.javaex.ex06;

public class MathApp {

	public static void main(String[] args) {

		Math math = new Math();

		System.out.println(math.plus(3, 2));
		System.out.println(math.plus(34.2, 27.4));
		System.out.println(math.plus(4, 5.6));
		System.out.println(math.plus(89.2, 5));

		/*
		 * 케이스1 Math math = new Math(); System.out.println(math.plusInt(3, 2));
		 * System.out.println(math.plusDouble(3.5, 76.4));
		 */
	}

}
