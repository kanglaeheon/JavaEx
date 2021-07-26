package com.javaex.oop.summary;

public class Panda extends Animal {
	//	생성자
	public Panda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void say() {
		// 추상 메서드구현
		System.out.printf("%s: zzzzzz%n", name);
	}

}
