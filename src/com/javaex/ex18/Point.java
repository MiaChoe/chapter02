package com.javaex.ex18;

public class Point implements Drawable {
	//필드
	private int x;
	private int y;
	
	public Point() {		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
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
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	public void draw() {//인터페이스 구현
		System.out.println("x=" + x + " y=" + y + " 점을 그렸습니다.");
	}





}
