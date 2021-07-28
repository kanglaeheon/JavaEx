package com.javaex.bookquiz.chap08.exercise05;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {	//	익명클래스 : 인스턴스 생성과 동시에 오버라이딩
			public void work() {
				System.out.println("복사를 합니다");	//	오버라이딩
			}
		};	//	인스턴스 중괄호 뒤에 ';'
		action.work();
	}

}
