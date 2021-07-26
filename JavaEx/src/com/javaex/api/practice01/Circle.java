package com.javaex.api.practice01;

public class Circle {
	//	필드
	private	int x;
	private int y;
	private int radius;
	
	//	생성자
	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		}
	//	.equals 메소드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Circle ) {
			Circle other = (Circle)obj;
			return radius == other.radius;
		}
		return super.equals(obj);
	}
}
