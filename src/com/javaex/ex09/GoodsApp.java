package com.javaex.ex09;//2021.11.25(목)10:22수업,static
						//메모리에 올라가기도 전에 static쓰인 모든 게 먼저 틀이름이 static에 올라감
						//메소드 일반 애들도 붙일 수 있음

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("Nikon", 400000);
		System.out.println(camera.toString());
		
		Goods cup = new Goods();
		cup.setName("Mug Cup");
		cup.setPrice(2000);
		System.out.println(cup.toString());
		
		Goods computer = new Goods("LG Gram", 900000);
		System.out.println(computer.toString());
		
	}
	
}
