package com.javaex.practice01_1;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int i, j, k;// i = 입력 숫자 (증감 x), j = 행 반복 횟수, k = 열 횟수
		i = scanner.nextInt();

		for (j = 1; j <= i; j++) {
			for (k = 1; k <= j; k++) {
				System.out.print(j);
				}
			System.out.println("");
		}
		scanner.close();
	}

}
