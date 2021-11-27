/*Done//2021.11.27(토)10:49
[문제]
Point 클래스를 만드세요
	1) x, y 좌표를 나타낼 수 있는 필드 작성
	2) x, y 좌표에 접근할 수 있는 getter/setter 메소드 작성
	3) 다음 실행 결과를 참조하여 draw()메소드 작성
 */

package com.javaex.ex02;

public class _Point_P01 {
	//필드
	int x;
	int y;
	
	
	//속성자
	
	//메소드:s/g
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드:일반
	public void draw() {
		System.out.println("점[x="+ x + ", y=" + y +"]을 그렸습니다.");	
	}
	
	
	
}
