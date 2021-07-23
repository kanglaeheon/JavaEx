package com.javaex.oop.point.v4;

//	상속: extends
public class ColorPoint extends Point {	
	//	생성자 선언x -> 기본생성자 선택
	//	부모생성자 명시x -> 부모 기본생성자 선택
	
	//	추가 필드
	private String color;
	
	
	//	생성자
	public ColorPoint(int x, int y, String color) {
		//	명시적으로 부모 생성자 선택
		super(x, y);
		this.color = color;
	}
	
	//	getter, setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//	메서드 오버라이드
	@Override	//	오버라이드 시에 반드시 넣어주도록 하자
	public void draw() {	// 물려 받았으나 자신만의 새로운 기능을 덮어쓰기
		//	방법 1. 부모의 getter, setter를 이용
//		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.%n",
//				super.getX(),
//				super.getY(), 
//				color);
		//	방법 2. 부모의 필드를 protected로 변경
		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.%n",
				x, y, color);	//	부모의 필드 접근제한자가 protected이기에 접근 가능
		
	}
	
	//	TODO: Point 클래스의 draw(boolean) 메서드를 오버라이드 해 보기
}
