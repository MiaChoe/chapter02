package com.javaex.ex04;//2021.11.22(화)16:49수업,

public class GoodsApp {

	//필드
	
	
	
	
	//생성자
	
	
	
	
	//메소드 중 getter/setter
	
	
	
	
	
	//메소드 중 일반
	public static void main(String[] args) {
		
		Goods camera = new Goods("Nikon", 400000);
		System.out.println(camera.toString());
		
		Goods cup = new Goods();
		cup.setName("Mug Cup");
		cup.setPrice(2000);
		System.out.println(cup.toString());
		
		
		
		
	}
	
	
	
	
}
