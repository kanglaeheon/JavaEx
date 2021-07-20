package com.javaex.practice01_1;

public class Problem01 {

	public static void main(String[] args) {
		int a = 0;
		while ( a <= 100 ) { 
			a++;
			if ( a % 5 == 0 && a % 7 == 0) {
				System.out.println(a);
			}
		}
	}
}
