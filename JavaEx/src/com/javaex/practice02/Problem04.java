package com.javaex.practice02;

public class Problem04 {

	public static void main(String[] args) {
		int i,j;
		
		int numbers[] = new int[6];
		
		for ( i = 0; i < numbers.length; i++) {
		numbers[i] = (int)(Math.random()*45)+1;
		
		for ( j = 0; j < i; j++) {
			if ( numbers[j] == numbers[i] ) {
				i--;
				break;
			}
		}
		}
		for ( i = 0; i < numbers.length; i++) {
			if ( i > 0) {
				System.out.print(", ");
			}
			System.out.print(numbers[i]);
		}
	}
}