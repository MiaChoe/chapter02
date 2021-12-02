//2021.11.2(목)14:15수업: 06.예외처리 중 연습문제

package com.javaex.ex20;

import java.io.IOException;

public class FileManager {

	//필드 - 생략
	
	//생성자
	//public FileManager() {}
	
	//메소드 g/s
	
	//메소드 일반
	public void readFile() throws IOException{// c://config.txt 을 읽어오는 메소드
		
		//System.out.println("파일을 읽었습니다.");
		
	
	    System.out.println("강제예외상황발생");
		throw new IOException(); ////예를 들어 인터넷이 안 돼서 파일을 못 읽거나 파일이 깨져서 못 읽을 때와 같은 예외가 발생
	
		
		
	}
	
	
}


