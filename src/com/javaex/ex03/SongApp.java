package com.javaex.ex03;//2021.11.22(화)11:47수업, 어제자 과제 불이행하여 cp

/*
[문제]
Song 클래스를 만드세요 Song 클래스는 다음과 같은 필드를 가지고 있습니다.
노래의 제목을 나타내는 title
가수를 나타내는 artist
노래가 속한 앨범 제목을 나타내는 album
노래의 작곡가를 나타내는 composer
노래가 발표된 연도를 나타내는 year
노래가 속한 앨범에서 트랙 번호를 나타내는 track
1)필드의 접근을 제한하고 getter/setter 메소드를 통해 접근하세요.
2)노래정보를 출력하는 showInfo()메소드를 작성하세요.

 */

public class SongApp {

	public static void main(String[] args) {
		
		
		//setter를 통해 정보를 메모리에 넣었는데
		Song s1 = new Song();
		//Song s1 = new Song("좋은 날", "아이유", "Real", "이민수", "2010", 3);
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
