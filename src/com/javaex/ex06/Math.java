//Done//2021.11.24(수)14:42_3.클래스의 정의 중 메소드오버로딩/2021.12.14(화)17:11_minipro 설명하시다가 나온 예시라 복습. Undone이었음.

package com.javaex.ex06;

public class Math {

	// 생성자
	public int plus(int num01, int num02) {
		int sum = num01 + num02;
		return sum;
	}

	public double plus(double num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}

	public double plus(double num01, int num02) {
		double sum = num01 + num02;
		return sum;
	}

	public double plus(int num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}

	/*
	 * 2021.12.14(화)17:14 오늘 수업 중 언급하신 Math패키지. 이건 아까 풀었던 Practice08에서 int +,-연산자들
	 * 사칙연산하는 거랑 같은 것 같다. 필드 Math와 Math관련한 gs를 동시에 생성 혹은 동시에 삭제하면 it works.
	 * 
	 * //필드
	 * 
	 * //생성자: 디폴트 생성자 사용. 안 만들어도 생기기 때문에 주석 처리만 하기로 함. 여기선 public Math() { }
	 * 
	 * //메소드-getter/setter: 필드가 없으므로 getter,setter도 생략
	 * 
	 * //메소드-일반
	 * 
	 * /* 2021.12.14(화)17:11_아래에 내가 주석 단 이게 뭐가 케이스1이라는지는 모르겠다. 왜냐하면 이 케이스만 생성자로 제시할
	 * 경우 int+double이 불가능해지니. 케이스1 public int plus(int num01, int num02) { int sum =
	 * num01+num02; return sum; }
	 * 
	 * public double plusDouble(double num01, double num02) { double sum = num01 +
	 * num02; return sum; }
	 */

}
