package com.javaex.practice01_1;

public class Problem03 {

	public static void main(String[] args) {
		int i,j; // i = 단, j= 곱
		for ( i = 1; i <= 9; i++) {
			for ( j = 2; j <= 9; j++) {
				System.out.print( j + "*" + i + "=" + (j*i) + "\t");
			} System.out.println(" ");
		}

	}

}
