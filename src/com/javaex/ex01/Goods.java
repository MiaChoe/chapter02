/*2021.11.21(월)16:13수업//객체지향 프로그래밍 중 3.클래스의 정의 중 메소드
2021.11.22(화)10:44수업//this 추가, 2021.11.26(토)

[문제]
쇼핑몰에서 상품을 관리하기 위해 상품관리 프로그램을 만들려고 합니다. 프로그램을 만들기 전에 업무(비즈니스) 분석을 통해 상품 객체를 분석하고 다음과 같은 Goods클래스를 정의 하였습니다. 

Goods 클래스를 정의하고 GoodsApp 클래스에서  Goods 클래스를 테스트 하세요.
  1) Goods 객체를 하나 생성하고 이 객체에 대한 레퍼런스 변수를 camera 로 합니다.
  2) 이 객체의 데이터인 각 각의 인스턴스 변수는 다음과 같은 값을 가지도록 합니다.
     상품이름 : “nikon”,   가격: 400000
  3) 값을 세팅 한 후,  객체의 데이터를 출력해 보세요.
  
다음의 데이터를 추가한 후, 출력해 보세요
상품이름 : “니콘”,    가격: 400000
상품이름 : “LG그램”,    가격: 900000
상품이름 : “머그컵”,    가격: 2000
 
*/

package com.javaex.ex01;

public class Goods {

	//필드 영역
	String name;
	int price;
	
	//메소드 정의하는 영역
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("---------------------");
	}
	
	

	
	
}
