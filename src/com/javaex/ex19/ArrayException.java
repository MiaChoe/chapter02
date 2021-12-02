//2021.11.2(목)12:06 06.예외처리 중 연습문제

package com.javaex.ex19;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
		
		int[] intArray = new int[] {3, 6, 9}; 
		
		try {
			System.out.println(intArray[3]);
		}catch (ArrayIndexOutOfBoundsException error) {
			System.out.println(error.toString());
		}catch (ArithmeticException error) {
			System.out.println(error.toString());
		}finally {
			System.out.println("finally 영역");
		}
			
		System.out.println(intArray[2]);
	}
}
