//2021.11.2(목)12:!8 06.예외처리 중 연습문제,2021.12.9(목)21:37 영상복습

package com.javaex.ex19;

public class NullPointException {
	public static void main(String[]args) {
		
		String str = new String("안녕하세요");
		
		try {
		str = null;		
		System.out.println(str.toString());
		} catch (Exception error) {
			System.out.println("주소값이 없습니다.");
		}
		
	}
}	
		/*
		String str = new String("안녕하세요");
		str = null;	//주소를 끊어버리므로 찍어낸 String 인스턴스로 접근이 불가능해짐	
				
		try { 
			str = null;
			System.out.println(str.toString());	
		} catch (Exception error) {
			
		} finally {
			
		}
		
				
		System.out.println(str.toString());		
	
		 */