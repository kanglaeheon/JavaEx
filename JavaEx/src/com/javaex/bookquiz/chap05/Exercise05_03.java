package com.javaex.bookquiz.chap05;

public class Exercise05_03 {

	public static void main(String[] args) {
		int i;
		int total = 0;
		for ( i = 1; i <= 100; i++) {
			if ( i % 3 == 0 ) {
				total += i;
			}
		}
		System.out.println("3의 배수의 합: " + total);

	}

}
