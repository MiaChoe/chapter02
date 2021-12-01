//2021.12.1(수)15:16인터페이스

package com.javaex.ex18;

public class Shape {//추상메소드를 가지고 있어서 클래스와 미완성 부분이 있음 area(
	private String lineColor;//shape단독으로 인스턴스화하면 안됨
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
	
	
	/*Drawable이 있으니 막자
	//메소드 일반
	public void draw() {
		System.out.println("선색: " + lineColor + ",  면색:" + fillColor + "인 도형을 그렸습니다.");
	}
	*/
	
	public double area() {//자식클래스에서는 꼭 내부코드를 구현해야 함
		return 0.10;//아무거나 넣어도 돼. 내부 코드를 작성할 수 없는 상황이다
	}

}