//2021.11.30(화)14:50 오버라이딩

package com.javaex.ex15;

public class Shape {
	private String lineColor;
	private String fillColor;
	
	
	//생성자
	public Shape(){
	}
		
	public Shape(String lineColor, String fillColor) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
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
	
	//메소드 일반
	public void draw() {
		System.out.println("선색: " + lineColor + ",  면색:" + fillColor + "인 도형을 그렸습니다.");
	}
	
}
