package com.javaex.oop.tv;

public class Tv {
	//	필드
	private int channel;
	private int volume;
	private boolean power;
	
	//	기본생성자
	public Tv() {}
	
	//	생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
		 
	//	getter/setter
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume; 
	}
	
	//	메소드 구현
	public void power(boolean power) {
		this.power = power;
	}
	
	public void channel(int channel) {
		if ( channel >= 1 && channel <= 255) {
			this.channel = channel;	
		}
	}
	
	public void channel(boolean up) {
		if ( channel == 1 ) {
			channel = up ? (channel + 1) : channel;
		}
		else if ( channel > 1 && channel < 255 ) {
			channel = up ? (channel + 1) : (channel -1 );
		}
		else if ( channel == 255 ) {
			channel = up ? channel : channel - 1;
		}
	}
	
	public void volume(int volume) {
		if ( volume <= 100 &&  volume >= 0) { 
			this.volume = volume;
			}
		}
	
	public void volume(boolean up) {
		if ( volume == 0 ) {
			volume = up ? (volume + 1) : volume;
		} 
		else if ( volume > 0 && volume < 100 ) {
			volume = up ? volume + 1 : volume - 1;
		}
		else if ( volume == 100 ) {
			volume = up ? volume : volume - 1;
		}
	}
	
	public void status() {
		System.out.println(channel);
		System.out.println(volume);
		System.out.println(power);
		System.out.println();
	}
}
