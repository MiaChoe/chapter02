/*Done//2021.11.27(토)10:49
[문제]
PointApp 클래스 만드세요
	1) draw() 메소드를 호출하여 다음과 같이 출력하세요
	2) 점[x=5, y=5]을 그렸습니다. / 점[x=10, y=23]을 그렸습니다.
*/

package com.javaex.ex02;

public class _PointApp_P01 {

	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(5);
		p01.draw();
		
		Point p02 = new Point();
		p02.setX(10);
		p02.setY(23);
		p02.draw();
	}

}
