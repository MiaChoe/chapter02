package com.javaex.ex09;//2021.11.25(목)11:49수업,생성자 오버로딩(같은 이름의 메소드)

public class MyMath {
		//필드: 필요 없음
		
		//생성자: 디폴트생성자 사용
		
		//메소드gs: 필드 없음
		
		//메소드 일반
		public int plus(int a, int b) {
			return a+b; //int sum = a+b; 이렇게 굳이 변수 안 만들고 바로 return에 입력	
		}
		
		public double plus(double a, double b) {
			return a+b;
		}
		
		public double plus(double a, int b) {
			double sum = a+b;
			return sum;
		}
		public double plus(int a, double b) {
			return a+b;
		}

}
