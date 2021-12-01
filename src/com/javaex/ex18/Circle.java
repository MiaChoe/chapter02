//2021.12.1(수)15:16인터페이스

package com.javaex.ex18;

public class Circle extends Shape implements Drawable {
	//필드
	private String lineColor;
	private String fillColor;
	private int radius;
	
	//생성자
	public Circle() {
		super();
	}
	
	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	//메소드gs
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

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드일반
	
	public void draw() {	
	}
	
	public double area() {
		double result = radius*radius*3.14;
		return result;
	}

}