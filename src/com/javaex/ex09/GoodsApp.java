package com.javaex.ex09;//2021.11.25(목)10:22수업,totalCount가 공통으로 쓰는 필드임을 명시해줘야 함


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
