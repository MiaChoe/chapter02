package com.javaex.ex07;

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

	// 메소드 gs
	public int getChannel() {
		if (channel < 1) {
			this.channel = 1;
		} else if (channel > 255) {
			this.channel = 255;
		}
		return channel;
	}

	public int getVolume() {
		if (volume < 0) {
			this.volume = 0;
		} else if (volume > 100) {
			this.volume = 100;
		}
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	// 메소드 일반
	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		this.channel = channel;
		getChannel();

	}

	public void channel(boolean up) {
		if (up == true) {
			channel = channel + 1;
		} else {
			channel = channel - 1;
		}
		getChannel();
	}

	public void volume(int volume) {
		this.volume = volume;
		getVolume();
	}

	public void volume(boolean up) {
		if (up == true) {
			volume = volume + 1;
		} else {
			volume = volume - 1;
		}
		getVolume();
	}

	public void status() {
		System.out.println("전원: " + power + ", 볼륨: " + volume + ", 채널: " + channel);
	}
}
