//2021.11.29(월)14:44수업/Done_2021.12.16(목)08:15

package com.javaex.ex14;

public class Rectangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자: super.lineColor = lineColor;는 에러 발생. 부모 클래스가 private로 보호되고 있기 때문
	public Rectangle() {
		super();
	}

	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	// 메소드gs
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

	// toString은 부모쪽에도 있다, 부모쪽 메소드 사용 못하게 하려고 같은 이름으로 "재정의"
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor()=" + getLineColor()
				+ ", getFillColor()=" + fillColor + "]";
	}

	public void draw() {
		System.out.println("선색:" + super.lineColor + " 면색:" + super.fillColor + " 가로" + this.width + " 세로:"
				+ this.height + "인 사각형을 그렸습니다.");
	}

}

/*
 * 2021.11.29(월)_메소드 일반 중 toString(): private을 protected로 바꿔버리는 건 좀 일이 크고
 * 조심스러우므로 getter setter를 쓴다
 * 
 * 2021.12.16(목)08:26_생성자: super.lineColor = lineColor;는 에러 발생. 부모 클래스가 private로
 * 보호되고 있기 때문
 */
