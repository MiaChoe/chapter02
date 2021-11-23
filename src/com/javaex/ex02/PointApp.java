package com.javaex.ex02;//2021.11.22(화)14:55수업, 
						//해당클래스를 메모리에 올리는 일이 주된+return을 쓰지 않는 생성자
						
/*
 Goods 클래스를 만드세요
1) 필드접근자를 private로 작성해서 외부에서 접근할 수 없게 합니다.
2) 필드에 값을 저장할 수 있도록 set메소드를 만드세요.
3) 필드에 값을 읽을 수 있도록 get메소드를 만드세요.
4) 아래와 같이 상품의 모든 정보를 출력해 주는 showInfo()를 만드세요
 */


public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p01 = new Point(3, 6);//setter를 이용하지 않고 바로 올리는 법
		/*
		p01.draw();
		*/
		
		Point p02 = new Point();
		p02.setX(7);
		p02.setY(7);
		p02.draw();
		
		System.out.println(p01.getX());
		
	}

}
