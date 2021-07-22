package com.javaex.practice02;

public class Problem03 {

	public static void main(String[] args) {
		//	주어진 문자열
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };
		
		int i,j;	// 카운터
		
		for ( i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		} System.out.println();
		for ( i = 0; i < c.length; i++) {
			switch ( c[i] ) {
		case ' ' :
			c[i] = ',';
			break;
		} System.out.print(c[i]);
	} 
	}
}
