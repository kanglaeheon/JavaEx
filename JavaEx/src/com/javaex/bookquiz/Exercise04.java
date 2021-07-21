package com.javaex.bookquiz;

public class Exercise04 {

	public static void main(String[] args) {

		int a; // 첫 번째 주사위 값
		int b; // 두 번째 주사위 값
		int i; // 카운터
		boolean dice = true; // 주사위 던지기 실행할 것인지

		while (dice = true) {
			a = (int) (Math.random() * 6) + 1;
			b = (int) (Math.random() * 6) + 1;
			System.out.println("(" + a + " ," + b + ")");

			if ( (a + b) == 5) {
				break;
			}
		}
	}

}
