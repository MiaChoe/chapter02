//2021.11.28(일)12:04영상 보며 복습//2021.11.22(화)11:16수업//어제자 숙제인데 불이행, this개념 적용중/2021.12.15(수)01:09

package com.javaex.ex03;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자

	// 메소드 gs
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

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드: 일반
	public void showInfo() {
		System.out.println(
				artist + "," + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}

	@Override // 값이 잘 들어갔나 확인하는 방법
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
