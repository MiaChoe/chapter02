//2021.11.22(화)14:55수업,2021.11.26(금)00:47수정,2021.11.26(금)22:42녹화 들으며 수정/2021.12.14(화)23:40

package com.javaex.ex02;

public class PointApp {
	public static void main(String[] args) {

		Point p01 = new Point();
		p01.setX(3);
		p01.setY(6);
		p01.draw(); // 한번에 출력하는 거 만들자

		// System.out.println(p01.getX());

		Point p02 = new Point();
		p02.setX(7);
		p02.setY(7);
		p02.draw();

	}

}

/*
 * 생성자: 1>메모리에 올리는 일을 주로 한다. 2>return을 가질 수 없다.
 * 
 * setter를 이용하지 않고 바로 올리는 법
 * public static void main(String[]args) {
 * 		Point p01 = new Point(3, 6);
 *		}
 */
