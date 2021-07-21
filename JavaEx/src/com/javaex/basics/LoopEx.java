package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

		public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forGugu();
//		continueEx();
//		whileGuguPractice();
//		forGuguPractice();
//		whileStarPractice();
//		forStarPractice();
		breakEx();
		System.out.println("End of Code");
	}
		
		
	// break 연습
	private static void breakEx() {
		int num = 1;
		while ( true ) {	//	무한 루프
			if ( num % 6 == 0 && num % 14 == 0 )
				break;	//	루프 탈출
				num ++;
			}
		System.out.println(num);
	}
	
	//	for 별찍기 연습
	private static void forStarPractice() {
		// 행루프
		for ( int row = 1; row <= 6; row++) {
			for ( int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
	
	//	while 별찍기 연습
	private static void whileStarPractive() {
		int row = 1;
		//	행루프
		while(row <= 6) {
			//	열루프
			int col = 1;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println();	// 한 행 끝난 후 개행
			row++;
		}
	}
	
		// 구구단 for 연습
	private static void forGuguPractice() {
		//	단루프
		for (int dan = 2; dan <= 9; dan++ ) {
			//	숫자 루프
			for (int num = 1; num <= 1; num++ ) {
				System.out.println(dan + "*" + num + "=" + (dan*num));
			}
		}
	}
	
		//구구단 while 연습
	private static void whileGuguPractice() {
		// 단루프
		for (int dan = 2; dan <= 9; dan++) {
			// 숫자 루프
			for (int num = 1; num <=9; num++) {
				System.out.println(dan + "*" + num + "=" + (dan*num));
			}
		}
	}
	
	// continue 연습
	private static void continueEx() {
		for (int i = 1;
				i <= 20;
				i++) {
				//	2의 배수 , 3의 배수는 출력하지 않는다.
			if ( i % 2 == 0 || i % 3 == 0 )
				continue;
			System.out.println(i);
		}
	}
	
	
		// 구구단 n단 연습
	private static void forGugu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int dan = scanner.nextInt();
		
		for ( int i = 1;	//	초기화
				i <= 9;		//	반복 조건
				i++) {		//	증감식
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		scanner.close();
	}
	
	//	do ~ while 연습
	private static void doWhileEx() {
		//	적어도 한번은 수행되어야 하는 반복,
		//	반복 조건이 반복문 내부에서 할당되는 경우
		Scanner scanner = new Scanner(System.in);
		int total = 0, value = 0;
		
		do {
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		value = scanner.nextInt();
		total += value;	//	total = total + value
		System.out.println("합계: " + total);
		} while(value != 0);
		scanner.close();
	}
		
	//	구구단 연습
	private static void whileGugu() {
		Scanner scanner = new Scanner(System.in);
		int dan, i = 1;
		
		System.out.println("단을 입력하세요.");
		System.out.print("단:");
		dan = scanner.nextInt();
		
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
			//  중요 : 제어 변수 변경
			i++;
		}
		scanner.close();		
	}
	
	//	반복문 연습
	private static void whileEx() {
		int x = 0;	//	반복 조건 제어 변수
		while ( x <= 9 ) {
			System.out.println("I Like Java" + x);
			x++;	//	주의: 무한 반복에 빠지지 않도록 적절히 제어
		}
	}

}
