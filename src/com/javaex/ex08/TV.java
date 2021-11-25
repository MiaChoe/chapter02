package com.javaex.ex08;//2021.11.24(수)15:00수업 후 과제로 주어짐

/*
[문제]
아래 TV 클래스의 main 메쏘드를 실행할 수 있도록, 요구 조건을  참조하여 TV 클래스를 정의 하세요.
1) 모든 필드는 private으로 접근 제어를 하고 getter만 작성합니다. (channel, volume, power 필드  read-only)
2) channel, volume, power의 초기값을 각각 7, 20, false 로 초기화 하는 생성자 작성
3) 기본 생성자 오버로딩
4) void power(boolean on ) 메소드 구현
5) void channel(int channel ) 메소드 구현 (1~255 유지) 
6) void channel(boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감)
7) void volume(int voluem ) 메소드 구현  ( 0 ~ 100 유지 )
8) void volume(boolean up ) 메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
9) void status() 메소드 구현( TV 정보 출력)
*/

public class TV {
	
		// 필드 
		private int channel;
		private int volume;
		private boolean power;

		// 생성자
		public TV(int channel, int volume, boolean power) {
			this.channel = channel;
			this.volume = volume;
			this.power = power;
		}
		public TV() {
			
		}

		// 메소드 -getter/setter
		public int getChannel() {
			if(channel < 1) {
				this.channel = 1;
			}
			else if(channel > 255) {
				this.channel = 255;
			}
			return channel;
		}

		public int getVolume() {
			if(volume < 0) {
				this.volume = 0;
			}
			else if(volume > 100) {
				this.volume = 100;
			}
			return volume;
		}

		public boolean isPower() {
			return power;
		}

		// 메소드 -일반
		public void power(boolean on) {
			this.power = on;
		}
		
		public void channel(int channel) {
			this.channel = channel;
			getChannel();
			
		}
		
		public void channel(boolean up) {
			if(up == true) {
				channel = channel + 1;
			}
			else {
				channel = channel - 1;
			}
			getChannel();	
		}
		
		public void volume(int volume) {
			this.volume = volume;
			getVolume();
		}
		
		public void volume(boolean up) {
			if(up == true) {
				volume = volume + 1;
			}
			else {
				volume = volume - 1;
			}
			getVolume();
		}
		
		public void status() {
			System.out.println("전원: " + power + ", 볼륨: " + volume + ", 채널: " + channel);
		}
	}























	
	
}
