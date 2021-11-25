package com.javaex.ex09;

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
