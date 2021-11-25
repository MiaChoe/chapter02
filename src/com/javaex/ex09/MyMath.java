package com.javaex.ex09;//2021.11.25(목)11:49수업,생성자 오버로딩(같은 이름의 메소드)

public class MyMath {
		//필드: 필요 없음
		private static double PI = 3.14; //static이나 final로 정한 애들은 capital letters
	
		//생성자: 디폴트생성자 사용
		
		//메소드gs: 필드 없음
		
		//메소드 일반
		public static int plus(int a, int b) {
			return a+b; //int sum = a+b; 이렇게 굳이 변수 안 만들고 바로 return에 입력	
		}
		
		public static double plus(double a, double b) {
			return a+b;
		}
		
		public static double plus(double a, int b) {
			double sum = a+b;
			return sum;
		}
		public static double plus(int a, double b) {
			return a+b;
		}

		public static double circleArea(int radius) {/
			return radius*radius*pi;
			
		public static double circleRound(int radius) {
			return (radius+radius)*pi;
		}
		
		
		
}
