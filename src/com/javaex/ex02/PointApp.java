package com.javaex.ex02;//2021.11.22(화)14:55수업,
						//해당클래스를 메모리에 올리는 일이 주된+return을 쓰지 않는 생성자
						//2021.11.26(금)00:47수정
						//2021.11.26(금)22:42녹화 들으며 수정
/*
[문제]
PointApp 클래스 만드세요
	1) draw() 메소드를 호출하여 다음과 같이 출력하세요
*/


public class PointApp {
	public static void main(String[] args) {
	
		Point p01 = new Point();
		p01.setX(3);
		p01.setY(6);
		p01.draw(); //한번에 출력하는 거 만들자
		
		//System.out.println(p01.getX());
		
		Point p02 = new Point();
		p02.setX(7);
		p02.setY(7);
		p02.draw();
		
		}
		
}	
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p01 = new Point(3, 6);//Point(2) setter를 이용하지 않고 바로 올리는 법
		/*
		p01.setX(3);
		p01.setY(6);
		*/
		
		/*
		p01.draw();
		*/
		
	/*
		Point p02 = new Point(); //Point()
		p02.setX(7);
		p02.setY(7);
		p02.draw();
		
		
		Point p03 = new Point(100); //Point(1)
		p03.setY(101);
		p03.draw();
		
		
	 */		


