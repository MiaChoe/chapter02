//2021.12.1(수)10:58

package com.javaex.ex17;

public class Rectangle extends Shape {
	//필드. 단, 앞 둘은 부모의 것을 	
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		
	} //Shape: 기본 생성자

	
	//부모를 고려해서 생성자를 만든다
	public Rectangle(String lineColor, String fillColor ,int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	//메소드 gs
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

	//toString은 부모쪽에도 있다, 부모쪽 메소드 사용 모샇게 하려고 같은 이름으로 "재정의"
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getWidth()=" + getWidth() + ", getHeight()="
				+ getHeight() + ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	//2021.11.30(화)15:50 상속받은 거 의미 살리려면, 부모의 필드가private니까 그냥 fillColor말고 getFilColor로
	public void draw() {
		System.out.println("선색:" + getLineColor() + " 면색:" + getFillColor() + " 가로" + this.width + " 세로:" + this.height + "인 사각형을 그렸습니다.");
	}
	
	public double area() {
		double result = width*height;
		return result;
	}
}	
	