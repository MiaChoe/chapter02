package com.javaex.ex05;//2021.11.24(수)10:17수업 중 어제자 과제 확인
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


public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private String compser;
	private String year;
	private int ticket;
	
	//생성자
	public song() {
		
	}

	public Song(String title, String artist, String album, String compser, String year, int ticket) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.compser = compser;
		this.year = year;
		this.ticket = ticket;
		
	}

	
	
	
	//메소드-getter/setter	
	
public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getCompser() {
		return compser;
	}

	public void setCompser(String compser) {
		this.compser = compser;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}


	//메소드-일반
@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", compser=" + compser + ", year="
				+ year + ", ticket=" + ticket + "]";