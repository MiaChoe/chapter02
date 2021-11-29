package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		//메모리가 움직이는 시나리오
		
		//사각형 3개를 만든다(메모리에 올린다)
		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02 = new Rectangle("파랑", "노랑", 10, 20);
		Rectangle r03 = new Rectangle("빨강", "빨강", 55, 77);
		Circle c01  = new Circle("보라", "빨강", 15);
		
	
		//사각형 관리를 위해서 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 배열에 넣는다(주소)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//모두 draw
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//모든 사각형 선색만 출력 
		for(int i =0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
		}
		
		System.out.println(c01.toString());
		
	}
	
	

}
