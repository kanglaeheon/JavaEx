package com.javaex.oop.staticmember;

public class StaticEx {
	
	public static int refCount;	//	클래스 멤버
	public static String classVar;	//	클래스 변수
	public String instaceVar;	//	인스턴스 변수
	
	//	static 영역의 초기화
	static {
		refCount = 0;
		classVar = "Static Member";	//	OK
//		instanceVar = "Instance Member";	//	static -> instance 접근 불가
		System.out.println("Static Block");
	}
	
	public StaticEx() {
		refCount ++;	//	참조 카운트를 증가 시킨다
		System.out.println("Instance Created");
		System.out.println("현재 참조 카운트: " + refCount);
	}
	
	
	//	소멸자 : finalize + ctrl + space
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}
