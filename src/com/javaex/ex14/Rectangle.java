//2021.11.29(월)14:44수업
//private을 protected로 바꿔버리는 건 좀 일이 크고 조심스러우므로 getter setter를 쓴다

package com.javaex.ex14;

public class Rectangle extends Shape {
	//필드. 단, 앞 둘은 부모의 것을 	
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();
	} //Shape: 기본 생성자

	
	//부모를 고려해서 생성자를 만든다
	public Rectangle(String lineColor, String fillColor ,int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	//메소드gs
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
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor()=" + getLineColor()
				+ ", getFillColor()=" + fillColor + "]";
	}


	


	
	
	
	
}
