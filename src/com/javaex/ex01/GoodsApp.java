package com.javaex.ex01;//2021.11.21(월)14:00수업//Chap02.객체지향 프로그래밍 중 3.클래스의 정의 중 클래스의 구조, 필드

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods(); //붕어빵 틀에 해당하는 애는 여기서 딱 찍어주고 다시 하드디스크에 잘 있다. 주소형 이름은 힙에 따라가면 나오는 이름으로
		
		camera.name = "Nikon";//틀에 밀가루 반죽 넣고 슈크림을 넣을 수도 있었지만 팥을 넣은 격
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
	}

}
