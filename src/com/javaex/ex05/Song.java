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
	private int track;
	
	//(디폴트)생성자
	public Song() {
		//메모리에 올리는 일
		System.out.println("Song(0)");
	}
	
	public Song(String title, String artist, String album, String compser) {
		this(title, artist, album, composer, ""); //맨 마지막 track자리에 공백을 주는 경우
		System.out.println("Song(4)");
	}
	
	

	public Song(String title, String artist, String album, String compser, String year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		
		//작곡가:작곡가 이름이 최대10글자까지만 입력 (코드100줄)
		this.compser = compser;
		
		//년도: 올해(2021년)이후 년도가 들어오면 2021년으로 처리
		this.year = year;
		System.out.println("Song(5)");
	}
	
	/*
	//Generator using Fiels통해서 바로 생성, 6개 필드값 모두 초기화하는 생성자 버스커버스커 위해 새로 추가함
	public Song(String title, String artist, String album, String compser, String year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.compser = composer;
		this.year = year;
		this.track = track;
		System.out.println(Song(6));
	}

	*/
	
	//메소드-getter/setter	
	
	public String getTitle() {
		//return title; 아래와 같이 써도 돼. 2021.11.24(화)11:07 다만 헷갈릴 일이 없으므로 지금 주석칸처럼 많이 쓴다
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

	public int getrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	



	//메소드-일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", compser=" + compser + ", year="
				+ year + ", track=" + track + "]";