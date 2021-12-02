//2021.11.2(목)14:15수업: 06.예외처리 중 연습문제

package com.javaex.ex20;

import java.io.IOException;

public class FileManager {
	//필드: 생략
	
	//생성자
	public FileManager() {
	}
	
	//메소드 gs: 필드 없으니 만들 수도 없음
	
	//메소드일반
	public void readFile() {// c://config.txt를 읽어오는 메소드라고 가정해보자		
		try {
			System.out.println("강제예외상황발생");	
			throw new IOException(); //예를 들어 인터넷이 안 돼서 파일을 못 읽거나 파일이 깨져서 못 읽을 때와 같은 예외가 발생
			}
		catch (IOException error) {
			System.out.println("파일이 없습니다.");
			}
		
	}
	
}
