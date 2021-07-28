package com.javaex.bookquiz.chap05;

public class Exercise05_06 {

	public static void main(String[] args) {
		int row; // 행
		int col; // 열
				
		for ( row = 1; row <=5; row++ ) {
			for ( col = 1; col <= row; col++) {
				System.out.print("*");
			} System.out.println();
		}

	}

}
