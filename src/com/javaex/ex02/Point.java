//Done/2021.11.21(화)09:56수업, 2021.11.24(수)13:53_boolean넣은 draw/2021.11.26(금)22:45녹화 들으며 수정: draw이해, this.수업듣기/Done_2021.12.14(화)23:43

package com.javaex.ex02;

public class Point {

	// 필드
	private int x; // 3
	private int y; // 6

	// 생성자

	// 메소드: 메소드를 통해 불러올 거야, draw가 있어서 막혀있어
	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	// 메소드 일반
	public void draw() {// 자기자신의 필드값을 읽을 거니까 줄 필요 없어, 갖고 있는 거니까.
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

}

/*
 * public class Point {
 * 
 * //필드 private int x; private int y;
 * 
 * /* //생성자 public Point() { System.out.println("Point()실행"); }
 */
/*
 * public Point(int x, String name) { //해당클래스를 메모리에 올리는 일 this.x = x;
 * System.out.println("Point(1)"); }
 * 
 * //아래와 같이는 못하는데 위의 int x와 자료형까지 같기 때문이다 public Point(int y, String name) {
 * //해당클래스를 메모리에 올리는 일 this.y = y; }
 * 
 * 
 * 
 * 
 * public Point(int x, int y) { //위와 같이 쓰면 무조건 해당클래스를 메모리에 올려둠. setter가 했던 일을
 * 똑같이 해달라고 이제 밑에 일 시킬 차례 this.x = x; this y = y;
 * System.out.println("Point(2)"); }
 * 
 * 
 * 
 * //메소드: 필드의 x와 밖에서 받은 x를 잘 구분해두는 것도 중요함. 하다보면 필드의 변수와 메소드 새 변수 같은 게 ㅈ홓아 public
 * void setX(int x); { if(x>=0) { this.x = x; } else { this.x = 0; } }
 * 
 * //값을 읽어오는 거라서 특별히 불러올 게 없음 public int getX() { return x; }
 * 
 * public int setY(int y) { this.y = y; }
 * 
 * public int getY() { return y; }
 * 
 * public void draw() { System.out.println("점[x= "+ x +", " +"  y =" + y +
 * " 을 그렸습니다."); }
 * 
 * 
 * //action=true 그리는 기능, action=false면 지우는 기능 public void draw(boolean action) {
 * if(action == true) { System.out.println("점[x=" + x + ", y=" + y +
 * "]을 그렸습니다"); } else if(action == false) { System.out.println("점[x=" + x +
 * ", y=" + y + "]을 그렸습니다"); } else { System.out.println("점[x=" + x + ", y=" + y
 * + "]을 그렸습니다"); } }
 * 
 * 
 * @override public String toString() { return "Point[x="+x+", "
 * 
 * }
 * 
 * }
 */
