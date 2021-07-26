package com.javaex.oop.summary;

public abstract class Animal {
	//	필드
	protected String name;	//	접근제한자 : private < default < protected < public
	protected int age;
	
	//	생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public Animal(String name, int age) {
		//	자신의 다른 생성자 호출
		this(name);
		this.age = age;
	}
	
	//	일반 메서드
	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}
	
	//	추상 메서드: 선언만 한다, Abstract 붙인다
	//	자식 클래스에서 Override 해야한다
	public abstract void say();
}
