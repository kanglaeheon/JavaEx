package com.javaex.bookquiz.chap05;

public class Exercise05_07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		int i;	// 카운터
		
		for ( i = 0; i < array.length; i++ ) {
			if ( array[i] > max ) {
				max = array[i];
			}
		}
		
		System.out.println("max: " + max);
	}

}
