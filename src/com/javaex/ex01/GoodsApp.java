//2021.11.21(월)14:00수업_클래스의 구조 중 필드/Done_2021.11.25(목)19:08복습/2021.12.14(화)field, reference variable, instance variable, getter/setter,'variable'.set'Field'(field value);

package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);

		camera.showInfo();

		Goods computer = new Goods();
		computer.setName("LG 그램");
		computer.setPrice(900000);

		computer.showInfo();

		// computer LG Gram

		/*
		 * System.out.println(camera.getName()); System.out.println(camera.getPrice());
		 */

		/*
		 * Goods camera = new Goods(); //붕어빵 틀에 해당하는 애는 여기서 딱 찍어주고 다시 하드디스크에 잘 있다. 주소형
		 * 이름은 힙에 따라가면 나오는 이름으로 camera.name = "니콘";//틀에 밀가루 반죽 넣고 슈크림을 넣을 수도 있었지만 팥을
		 * 넣은 격 camera.price = 400000;
		 * 
		 * Goods computer = new Goods();//붕어빵 틀 찍고 다시 하드디스크로 틀은 돌아간 상황. 그런데 이러면 아무도 접근하지
		 * 못함. 그래서 대입할 곳 변수와 자료형 적자 computer.name = "LG Gram"; computer.price = 900000;
		 * 
		 * Goods cup = new Goods(); cup.name = "Mug Cup"; cup.price = 2000;
		 * 
		 * System.out.println(camera.name); System.out.println(camera.price);
		 * 
		 * System.out.println(computer.name); System.out.println(computer.price);
		 * 
		 * System.out.println(cup.name); System.out.println(cup.price);
		 */
	}

}
