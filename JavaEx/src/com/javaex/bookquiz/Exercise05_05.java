package com.javaex.bookquiz;

public class Exercise05_05 {

	public static void main(String[] args) {
		int x,y;
		for ( x = 1; x <= 10; x++ ) {
			for ( y = 1; y <= 10; y++ ) {
				if ( 4*x + 5*y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}

	}

}
