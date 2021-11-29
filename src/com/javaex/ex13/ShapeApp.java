package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		//메모리가 움직이는 시나리오
		
		//사각형 3개를 만든다(메모리에 올린다)
		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02 = new Rectangle("파랑", "노랑", 10, 20);
		Rectangle r03 = new Rectangle("빨강", "빨강", 55, 77);
		
		//원 1개 c01을 만든다(메모리에 올린다)
		Circle c01  = new Circle("보라", "빨강", 15);
		Circle c02  = new Circle("보라", "빨강", 15);
		Circle c03  = new Circle("보라", "빨강", 15);
		
		//삼각형 1개 t01을 만든다(메모리에 올린다)
		Triangle t01 = new Triangle("검정", "흰색", 20, 30);
		Triangle t02  = new Triangle("보라", "초록", 15, 15);
		Triangle t03 = new Triangle("검정", "빨강", 30, 50);
	
		//사각형 관리를 위해서 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];
	
		//원 관리를 위해서 배열을 만든다
		Circle[] cArray = new Circle[3];
	
		//삼각형 관리를 위해서 배열을 만든다
		Triangle[] tArray = new Triangle[3];
		
		//사각형을 배열에 넣는다(주소)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//원을 배열에 넣는다(주소)
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//삼각형을 배열에 넣는다(주소)
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		//모두 draw
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		System.out.println("============================");
		//모든 사각형 선색만 출력 
		for(int i =0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
		}
		
		
		
	}
	
	
	

}
