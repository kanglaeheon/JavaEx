package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i;
		int num;
		int total = 0;
		double averageTotal = 0.0; 
		
		int[] intArray = new int[5];
		for ( i = 0; i <= ( intArray.length - 1 ); i++) {
			num = scanner.nextInt();
			intArray[i] = num;
			total += num;
		}
		averageTotal = (double)total / intArray.length;
		
		System.out.printf("주어진 정수의 평균은 %.1f 입니다.", averageTotal);
	}

}
