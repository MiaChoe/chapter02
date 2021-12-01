//2021.12.1(수)11:00

package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*자, 이제 시선을 자식들에게로 돌리기 위해 이들을 주석 처리해보자
		Rectangle r01 = new Rectangle("빨강", "빨강", 5, 10);
		System.out.println(r01.area());
		
		Circle c01 = new Circle("파랑", "파랑", 5);
		System.out.println(c01.area());
		
		Triangle t01 = new Triangle("노랑", "노랑", 5, 10);
		System.out.println(t01.area());
		*/
		
		//모양이 다른 세 도형을 1개의 배열로 관리하기 위해 배열을 만듦
		Shape[] sArray = new Shape[3];
		
		//메모리에 도형을 만든다
		Shape r01 = new Rectangle("빨강", "빨강", 5, 10);
		Shape c01 = new Circle("파랑", "파랑", 5);
		Shape t01 = new Triangle("노랑", "노랑", 5, 10);
		
		//배열에 도형을 담는다
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		//모든 도형의 면적 구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area()); 
		}
	}
}
