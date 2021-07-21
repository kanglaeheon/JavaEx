package com.javaex.practice01_2;

import java.util.Scanner;

public class Preblem08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int totalMoney;	//	잔고
		int num;	//	입력 명령어
		int moveMoney;	//	입출금
		
		totalMoney= 0;	//	시작 잔고
						
		boolean exit = false;
		
		while ( exit == false ) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			num = scanner.nextInt();	// 명령어 입력
			switch (num) {
			case 1 :
				System.out.print("예금액>");
				moveMoney = scanner.nextInt();
				totalMoney += moveMoney;
				break;
			case 2 :
				System.out.print("출금액>");
				moveMoney = scanner.nextInt();
				totalMoney -= moveMoney;
				break;
			case 3 :
				System.out.println("잔고액>" + totalMoney);
				break;
			case 4 :
				System.out.println("프로그램 종료");
				exit = true;
				break;
			default :
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		scanner.close();
	}

}
