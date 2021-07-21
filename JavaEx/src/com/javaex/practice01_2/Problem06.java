package com.javaex.practice01_2;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int sum = 0;
		int i;

		if (num % 2 == 0) {
			for (i = 1; (i * 2) <= num; i++) {
				sum += (i * 2);
			}
		} else {
			for (i = 1; ((i * 2) - 1) <= num; i++) {
				sum += ((i * 2) - 1);
			}
		}
		System.out.println("결과값: " + sum);
		scanner.close();
	}
}
