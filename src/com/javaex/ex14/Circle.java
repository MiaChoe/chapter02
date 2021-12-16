//2021.11.29(월)16:18수업/Done_2021.12.16(목)08:15

package com.javaex.ex14;

public class Circle extends Shape {
	// 필드: 부모에서 상속받은 lineColor와 fillColor를 써줘도 무방함
	private int radius;

	// 생성자
	public Circle() {
		super();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
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

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드일반
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius
				+ ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor() + ", getRadius()="
				+ getRadius() + "]";
	}

	public void draw() {
		System.out.println("선색:" + super.lineColor + " 면색:" + super.fillColor + " 반지름:" + radius + "인 원을 그렸습니다.");
	}

}

/*
 * 2021.12.16(목)08:26_생성자: super.lineColor = lineColor;는 에러 발생. 부모 클래스가 private로
 * 보호되고 있기 때문
 */