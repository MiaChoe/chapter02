//2021.12.15(수)08:21

package com.javaex.ex12;

public class ColorPoint extends Point {

	// 필드
	public String color;

	// 생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}

	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}

	public ColorPoint(int x, int y, String Color) {// 자동생성자생성기로 안 생겨서 만듦.그래야 저쪽 오류 없었음
		super();
		this.color = color;
		System.out.println("ColorPoint(3)");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void showInfo() {
		System.out.println("===============");
		System.out.println("x: " + super.getX() + this.color);
		System.out.println("y: " + super.getY() + this.color);
		System.out.println("===============");
	}
}

/*
 * 2021.12.15(수) 08:45 프린트에 String color가 있어서 자식 필드값으로 color를 설정하긴 했으나 기능 안 하는 것
 * 같아서 이상함 => String형의 생성자를 만들기 위해 존재한다는 걸 알았음. 필드추갈 마지막에 했기 때문에 String형 생성자 없어서
 * 오류 났었고 모든 생성자에 Sysout써서 어디 생성자로 출력한 건지 밝힘
 * 
 * 자식클래스의 일반메소드 showInfo에서 부모메소드의 showInfo상의 this.x는 여기선 오류가 나며 super.x도 불가능
 * 'super.'을 입력하면 자동완성으로 getX(), getY(), getClass()가 나옴
 * 
 * 아까부터 마지막 }에 왜 계속 에러가 나는지 모르겠다. 창 못 읽고 꽁띠뉴 눌렀더니 그제서야 오류 사라짐. hotcode래.
 * 
 * run돌리고 나니 cp1과 cp2는 0red, 0null이 나왔음. 수정 요함. 
 * 파라미터랑 무관한 거고 Point는 되는데 ColorPoint가 문제인 거야
 */
