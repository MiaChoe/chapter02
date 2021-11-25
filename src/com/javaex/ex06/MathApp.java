package com.javaex.ex06;//2021.11.24(수)14:42 3.클래스의 정의 중 메소드오버로딩

public class MathApp {
	
		public static void main(String[] args) {
			
			Math math = new Math();
			System.out.println(math.plus(3, 2));
			System.out.println(math.plus(34.2, 27.4));
			System.out.println(math.plus(4, 5.6));
			System.out.println(math.plus(89.2, 5));
			
			
			
			/*케이스1
			Math math = new Math();
			System.out.println(math.plusInt(3, 2));
			System.out.println(math.plusDouble(3.5, 76.4));
			*/
		}
	
	
	
}
