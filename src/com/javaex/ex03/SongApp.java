package com.javaex.ex03;//2021.11.22(화)11:47수업, 어제자 과제 불이행하여 cp

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song();
		s1.setTitle("좋은 날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear("2010");
		s1.setTrack(3);
				
		//System.out.println(s1.getArtist());
		s1.showInfo();
		
		Song s2 = new Song(); //Song s2이거를 맨 위 Song s1과 붙어 있어도 무방하다. 공간부터 내고 밑 행위 이행하는 거라서
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-Dragon");
		s2.setYear("2007");
		s2.setTrack(2);
		
		s2.showInfo();
		
		Song s3 = new Song();
		s3.setTitle("벚꽃엔딩");
		s3.setArtist("버스커버스커");
		s3.setAlbum("버스커버스커1집");
		s3.setComposer("장범준");
		s3.setYear("2012");
		s3.setTrack(4);
		
		//s3.showInfo();
		System.out.println(s3.toString());
		
		
	}

}
