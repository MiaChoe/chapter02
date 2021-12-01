//2021.11.30(화)14:50 오버라이딩


package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		//모든 도형 관리하는 배열 만듦
		Shape[] sArray = new Shape[3];
		
		Shape r01 = new Rectangle("빨강", "빨강", 5, 5);
		sArray[0] = r01;
		
		Shape c01 = new Circle("노랑", "노랑", 100);
		sArray[1] = c01;
	
		Shape t01 = new Triangle("파랑", "파랑", 20, 20);
		sArray[2] = t01;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
	}

}
