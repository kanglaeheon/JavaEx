package com.javaex.bookquiz.chap08.exercise05;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다");
			}
		};	//	 ;이 메소드 중괄호 } 뒤에 왜 붙는가?
		action.work();
	}

}
