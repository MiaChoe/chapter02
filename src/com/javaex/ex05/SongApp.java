package com.javaex.ex05;

public class SongApp {
	public static void main(String[] args) {
		
		//디폴트생성자를 쓸 계획
		Song s01 = new Song();
		s01.setTitle("좋은 날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setCompser("이민수");
		s01.setYear("2011");
		s01.setTrack(3);
		
		//System.out.println(s01.toString());
		
		Song s02 = new Song();
		s02.setTitle("거짓말");
		s02.setArtist("G-Dragon");
		s02.setAlbum("Always");
		s02.setCompser("G-Dragon");
		s02.setYear("2010");
		s02.setTrack(2);
		
		
		
		
	}
	
	
	

}
