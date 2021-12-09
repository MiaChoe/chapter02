//2021.11.2(목)12:06 06.예외처리 중 연습문제, 2021.12.9(목)19:02 영상복습

package com.javaex.ex19;

public class ArrayException {
	public static void main(String[] args) {
		
		int[] intArray = new int[] {3, 6, 9}; 
		
		try {
			System.out.println(intArray[3]);
		}catch (ArrayIndexOutOfBoundsException error) {//이처럼 문제점이 여럿일 경우를 대비하여 catch를 여러번 쓸 수 있음
			System.out.println(error.toString());
		}catch (ArithmeticException error) {
			System.out.println(error.toString());
		}finally {
			System.out.println("finally 영역");
		}
			
		System.out.println(intArray[2]);
	}
}
