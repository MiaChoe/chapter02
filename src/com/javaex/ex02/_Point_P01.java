package com.javaex.ex02;//2021.11.26(금)00:49
/*
[문제]
Point 클래스를 만드세요
	1) x, y 좌표를 나타낼 수 있는 필드 작성
	2) x, y 좌표에 접근할 수 있는 getter/setter 메소드 작성
	3) 다음 실행 결과를 참조하여 draw()메소드 작성 
*/


public class _Point_P01 {

	//필드
	int x;
	int y;
	
	
	//생성자: default값인 것 같음
	
	//메소드gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
