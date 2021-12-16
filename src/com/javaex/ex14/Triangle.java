//2021.11.29(월)16:19수업/Done_2021.12.16(목)08:15

package com.javaex.ex14;

public class Triangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 gs
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Triangle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", height="
				+ height + "]";
	}

	public void draw() {
		System.out.println("선색:" + lineColor + " 면색:" + fillColor + " 가로:" + width + " 세로:" + height + "인 삼각형을 그렸습니다.");
	}

}

/*
 * 2021.12.16(목)08:26_생성자: super.lineColor = lineColor;는 에러 발생. 부모 클래스가 private로
 * 보호되고 있기 때문
 */
