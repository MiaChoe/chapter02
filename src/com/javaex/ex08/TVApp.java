package com.javaex.ex08;//2021.11.24(수)15:00,
/*
[문제]
아래 TV 클래스의 main 메쏘드를 실행할 수 있도록, 요구 조건을  참조하여 TV 클래스를 정의 하세요.
1) 모든 필드는 private으로 접근 제어를 하고 getter만 작성합니다. (channel, volume, power 필드  read-only)
2) channel, volume, power의 초기값을 각각 7, 20, false 로 초기화 하는 생성자 작성
3) 기본 생성자 오버로딩
4) void power( boolean on ) 메소드 구현
5) void channel( int channel ) 메소드 구현 (1~255 유지) 
6) void channel( boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감)
7) void volume( int voluem ) 메소드 구현  ( 0 ~ 100 유지 )
8) void volume( boolean up ) 메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
9) void status() 메소드 구현( TV 정보 출력)

int channel
int volume
boolean power
getChannel()
getVolueme()
power( boolean )
channel( int )
channel( boolean )
volume( int )
volume( boolean )
status(

public  class TVApp {
 public static void main( String[] args ) {
 TV tv = new TV( 7, 20, false);  	
 
 tv.status();	
 
 tv.power( true );
 tv.volume( 120 );  //100으로 유지
 tv.status();		          
 
 tv.volume( false );
 tv.status();
 
 tv.channel( 0 );
 tv.status();		          
 
 tv.channel( true );
 tv.channel( true );
 tv.channel( true );
 tv.status();

 tv.power( false );
 tv.status();      		          
 }
}
*/
	public class TVApp {


	public static void main(String[] args) {

		TV tv = new TV( 7, 20, false);  
		
		tv.status();

		tv.power(true);
		tv.volume(120); // 100으로 유지
		tv.status();

		tv.volume(false);
		tv.status();

		tv.channel(0);
		tv.status();

		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();

		tv.power(false);
		tv.status();

		System.out.println(tv.getVolume());

	}

}