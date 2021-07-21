package com.javaex.practice02;

public class Problem01 {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		
		int i;
		int countArray = 0;
		int sumArray = 0;
		
		for ( i = 1; i < data.length; i++ ) {
			if ( data[i] % 3 == 0 ) {
				countArray++;			
			}
		}
		
		for ( i = 1; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				sumArray += data[i];
			}
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + countArray);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sumArray);
	}

}
