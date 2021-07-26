package com.javaex.api.practice02;

public class Rectangle {
	//	필드
	private int height;
	private int width;
	
	//	생성자
	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	// .equals 메소드 오버라이드
	@Override
	public boolean equals(Object obj) {
		Rectangle other = (Rectangle)obj;
		if ( obj instanceof Rectangle ) {
			return height * width == other.height * other.width;
			}
		return super.equals(obj);
	}
	
}
