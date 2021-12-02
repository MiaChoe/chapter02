//2021.12.2(목)14:20수업, 06.예외처리 중 연습문제

package com.javaex.ex20;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {
		
		
		FileManager fr = new FileManager();
		
		try {
			fr.readFile();
		} catch (IOException e) {
			System.out.println("error");
		}
		


	}

}