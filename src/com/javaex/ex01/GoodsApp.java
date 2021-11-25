package com.javaex.ex01;//2021.11.21(월)14:00수업//Chap02.객체지향 프로그래밍 중 3.클래스의 정의 중 클래스의 구조, 필드
						//Done//2021.11.25(목)19:08 복습
/*
[문제]
쇼핑몰에서 상품을 관리하기 위해 상품관리 프로그램을 만들려고 합니다. 프로그램을 만들기 전에 업무(비즈니스) 분석을 통해 상품 객체를 분석하고 다음과 같은 Goods클래스를 정의 하였습니다. 

Goods 클래스를 정의하고 GoodsApp 클래스에서  Goods 클래스를 테스트 하세요.
  1) Goods 객체를 하나 생성하고 이 객체에 대한 레퍼런스 변수를 camera 로 합니다.
  2) 이 객체의 데이터인 각 각의 인스턴스 변수는 다음과 같은 값을 가지도록 합니다.      상품이름 : “nikon”,   가격: 400000
  3) 값을 세팅 한 후,  객체의 데이터를 출력해 보세요.
 */


public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		
		/*
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		*/
		
		camera.showInfo();
		
		Goods computer = new Goods (); 
		computer.setName("LG Gram");
		computer.setPrice(900000);
		
		computer.showInfo();
		
		//computer LG Gram
		
		
		/*
		Goods camera = new Goods(); //붕어빵 틀에 해당하는 애는 여기서 딱 찍어주고 다시 하드디스크에 잘 있다. 주소형 이름은 힙에 따라가면 나오는 이름으로
		camera.name = "Nikon";//틀에 밀가루 반죽 넣고 슈크림을 넣을 수도 있었지만 팥을 넣은 격
		camera.price = 400000;
		
		Goods computer = new Goods();//붕어빵 틀 찍고 다시 하드디스크로 틀은 돌아간 상황. 그런데 이러면 아무도 접근하지 못함. 그래서 대입할 곳 변수와 자료형 적자
		computer.name = "LG Gram";
		computer.price = 900000;
		
		Goods cup = new Goods();
		cup.name = "Mug Cup";
		cup.price = 2000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		*/
	}

}
