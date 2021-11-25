package com.javaex.ex06;

public class Math {

	//필드
	
	
	
	
	//생성자
	//디폴트 생성자 사용: 안 만들어도 생기므로 주석 처리
	/*public Math() {		
	}*/
	
	
	
	//메소드-getter/setter: 필드가 없으므로 getter,setter도 생략
	
	
	
	
	
	//메소드-일반
	

	public int plus(int num01, int num02) {
		int sum = num01+num02;
		return sum;
	}
	
	public double plusDouble(double num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}
	
	public double plus(double num01, int num02) {
		double sum = num01 + num02;
		return sum;
	}
	
	
	
	/* 케이스1
	public int plus(int num01, int num02) {
		int sum = num01+num02;
		return sum;
	}
	
	public double plusDouble(double num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}
	*/
	
	
}
