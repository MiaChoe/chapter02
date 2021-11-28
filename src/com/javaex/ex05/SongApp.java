//2021.11.28(일)14:38영상 보며 복습
//2021.11.24(수)11:11수업,어제자 과제 확인하면서 오늘자 this()진도. 너무 어려우면 얘는 패스하시라

/*
[문제]
SongApp 클래스 만드세요
1) showInfo() 메소드를 호출하여 다음과 같이 출력하세요 
 */

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
		System.out.println(s01.toString());
		
		
		//5개는 생성자로 초기화하고, 트랙번호는 setter로 초기화-2021.11.28(일)에 이해
		//(=마지막 매개변수는 정해지지 않아서 정해진 다섯 개만 넣고 마지막 것은 미정이라 적지 않았다고 가정해보자)
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-Dragon", "2007");
		s02.setTrack(2); //옆과 같이 추가사항처럼 따로 기입
		//System.out.println(s02.toString());

		System.out.println("--------------------------");
		//6개 모두 필드값 초기화하는 생성자 사용(=이번엔 여섯가지를 한번에 넣으려는 s03이 생긴 경우)
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", "2012", 4);
		System.out.println(s03.toString());
		System.out.println("--------------------------");
		
		Song s04 = new Song("벚꽃엔딩2", "버스커버스커2", "버스커버스커1집2", "장범준2");
		System.out.println(s04.toString());
		System.out.println("--------------------------");
		
		
		//아이유 출력
		s01.showInfo();
		
		//빅뱅 출력
		s02.showInfo();
		
		//버스커버스커 출력
		s03.showInfo();
		
		System.out.println("--------------------------");
		Song s05 = new Song();
		
		
		
		
		
		
	}
	
	
	

}
