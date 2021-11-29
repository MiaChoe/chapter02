//2021.11.29(월)16:18수업

package com.javaex.ex14;

public class Circle extends Shape {
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
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius
				+ ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor() + ", getRadius()="
				+ getRadius() + "]";
	}
	
	
	

}
