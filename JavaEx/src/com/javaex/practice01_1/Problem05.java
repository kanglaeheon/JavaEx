package com.javaex.practice01_1;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i, j, result; // i = 반복 횟수, j = 입력 숫자, result = 최대값 메모리
		result = 0;
		for (i = 1; i <= 5; i++) {
			System.out.print("숫자: ");
			j = scanner.nextInt();
			if (j > result) {
				result = j;
			}
		}
		System.out.println("최대값은 " + result + "입니다.");
		scanner.close();
	}
}
