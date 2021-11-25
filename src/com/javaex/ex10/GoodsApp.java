package com.javaex.ex10;//2021.11.25(목)16:00수업, GoodsCam,Cup,Cam에 Array적용

public class GoodsApp {

	
	
	//메소드 일반
	public static void main(String[] args) {
		
		/*
		int[] intArray = new int[3];
		intArray[0] = 34;
		intArray[1] = 99;
		*/
		
		Goods[] goodsArray = new Goods[3]; 
		
		Goods[] camera = new Goods("Nikon", 400000);
		goodsArray[0] = camera;
		
		Goods cup = new Goods("Mug Cup", 2000);
		goodsArray[1] = cup;
		
		Goods computer = new Goods("LG Gram, 900000");
		goodsArray[2] = computer;
		
		/*
		System.out.println(camera.toString());
		goodsArray[0].toString()
		*/
		
		
		int count=0;
		for(int i =0; i<goodsArray.length; i++){
			
			if(goodsArray[i] != null)//주소가 없지 않다면=>주소가 있다면
			System.out.println(goodsArray[i].toString());
			count++;
		}
		System.out.println(count);
		
		//이름만 출력하기
		for(int i=0; i<goodsArray.lenght; i++) {
			goodsArray[i].showInfo(););		
		}
		
	}
}
