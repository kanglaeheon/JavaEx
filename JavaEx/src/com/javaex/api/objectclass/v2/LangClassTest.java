package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		System.out.println("p와 p2는 같은 객체인가? " + (p == p2));
		//	== 은 참조 주소 비교
		//	.equals() 는 내부 값의 비교
		System.out.println("p와 p2의 속성값은 같은가? " + (p.equals(p2)));
		
		Rectangle r1 = new Rectangle(100, 200);
		Rectangle r2 = new Rectangle(50, 400);
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		System.out.println("r1.equals(r2) ? " + r1.equals(r2));
		
		Circle c1 = new Circle(10,10,20);
		Circle c2 = new Circle(20,20,20);
		
		System.out.println("c1 = " + c1.toString());
		System.out.println("c2 = " + c2.toString());
		
		System.out.println("c1.equals(c2) ? " + c1.equals(c2));
		
	}
}
