package com.javaex.bookquiz;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int i = 0;	// 카운터
		int highScore = 0;
		double totalScore = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				int studentIn = scanner.nextInt();
				studentNum = studentIn;
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for ( i = 0; i < scores.length ; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = scanner.nextInt();
					totalScore += scores[i];
					if ( highScore < scores[i]) {
						highScore = scores[i];
					}
				}
			} else if(selectNo == 3) {
				for( i = 0; i < scores.length; i++)
				System.out.printf("scores[%d]: %d%n", i, scores[i] );
			} else if(selectNo == 4) {
				System.out.printf("최고 점수: %d%n", highScore);
				System.out.printf("평균 점수: %.1f%n", totalScore / studentNum);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}