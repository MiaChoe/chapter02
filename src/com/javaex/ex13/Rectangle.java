package com.javaex.ex13;//2021.11.29(월)10:53수업

public class Rectangle {
	//필드
	private String lineColor;
	private String fillColor;
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {	
	}
	
	public Rectangle(String lineColor, String fillColor, int width, int height) {
	super();
	this.lineColor = lineColor;
	this.fillColor = fillColor;
	this.width = width;
	this.height = height;
	}
	
	
	//메소드 gs

	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Rectangle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	public void draw() {
		System.out.println("선색:" +  lineColor + " 면색:" + fillColor + " 가로:" + width + " 세로:" + height +" 사각형을 그렸습니다.");
	}

	
	
}