//2021.11.29(월)14:44수업

package com.javaex.ex14;

public class Shape {
	//필드
	protected String lineColor; 
	protected String fillColor;
	
	
	//생성자
	public Shape() {		
	}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
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

		
	//메소드일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}	
	
	
}
