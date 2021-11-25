package com.javaex.ex01;//Done//2021.11.26(금)00:28 복습
/*
[문제]
Goods 클래스를 만드세요
	1) 필드접근자를 private로 작성해서 외부에서 접근할 수 없게 합니다.
	2) 필드에 값을 저장할 수 있도록 set메소드를 만드세요.
	3) 필드에 값을 읽을 수 있도록 get메소드를 만드세요.
	4) 아래와 같이 상품의 모든 정보를 출력해 주는 showInfo()를 만드세요.
*/
public class _Goods_P03 {
	

		private String name;
		private int price;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public void showInfo() {
			System.out.println("상품이름: " + name);
			System.out.println("가격: " + price);
			System.out.println("----------------");
		}
}		
		

