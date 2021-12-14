//2021.11.24(수)10:17수업/2021.11.28(일)14:38-18:20/Done_2021.12.15(수)01:56 ConstructorOverloading, this()(≒ Car(String model, int Speed)
package com.javaex.ex05;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// (디폴트)생성자
	public Song() {
		System.out.println("Song(0)");
	}

	public Song(String title, String artist, String album, String composer) {// 맨 마지막 track자리에 공백을 주는 경우
		System.out.println("Song(4)");
	}

	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;// 작곡가:작곡가 이름이 최대10글자까지만 입력 (코드100줄)
		this.year = year;// 년도: 올해(2021년)이후 년도가 들어오면 2021년으로 처리
		System.out.println("Song(5)");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		System.out.println("Song(6)");
	}

	// 메소드 gs
	public String getTitle() {
		// return title; 아래와 같이 써도 돼. 2021.11.24(화)11:07 다만 헷갈릴 일이 없으므로 지금 주석칸처럼 많이 쓴다
		return this.title;
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

	public String getComposer() {
		return composer;
	}

	public void setCompser(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	public void showInfo() {
		System.out.println(artist + ", " + title + " (" + album + ", " + track + "번 track, " + composer + " 작곡");
	}

}

/*
 * //Generator using Fields통해서 바로 생성, 6개 필드값 모두 초기화하는 생성자 버스커버스커 위해 새로 추가함
 * public Song(String title, String artist, String album, String composer,
 * String year, int track) { super(); this.title = title; this.artist = artist;
 * this.album = album; this.compser = composer; this.year = year; this.track =
 * track; System.out.println(Song(6)); }
 * 
 */
