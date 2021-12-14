//2021.11.28(일)12:09영상 보며 복습//2021.11.22(화)11:47수업, 어제자 과제 불이행/2021.12.14(화)22:22 staticField·Method, finalField, staticFinal(≒constant)

package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {

		Song s1 = new Song();
		s1.setTitle("좋은 날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear("2010");
		s1.setTrack(3);
		s1.showInfo();

		Song s2 = new Song();
		s2.setTitle("거짓말");
		s2.setArtist("빅뱅");
		s2.setAlbum("Always");
		s2.setYear("2007");
		s2.setTrack(2);
		s2.setComposer("G-Dragon");

		Song s3 = new Song();
		s3.setTitle("벚꽃엔딩");
		s3.setArtist("버스커버스커");
		s3.setAlbum("Real");
		s3.setYear("2012");
		s3.setTrack(4);

		System.out.println(s2.toString());
	}

}