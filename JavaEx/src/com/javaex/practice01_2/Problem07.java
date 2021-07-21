package com.javaex.practice01_2;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean restart = true; 
		while ( restart = true ) {
			System.out.println("========================");
			System.out.println("    [숫자맞추기게임 시작]    ");
			System.out.println("========================");
			System.out.print(">>");
			int random = (int) (Math.random() * 10) + 1;
			while ( restart = true ) {
				int num = scanner.nextInt();
				if (num > random) {
					System.out.println("더 낮게");
					System.out.print(">>");
				} else if (num < random) {
					System.out.println("더 높게");
					System.out.print(">>");
				} else {
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까?(y/n)  >>");
					String quitOrNot = scanner.next(); 
					if (quitOrNot.equals("y")) {
						System.out.println("========================");
						System.out.println("    [숫자맞추기게임 종료]    ");
						System.out.println("========================");
						restart = false;
					} else if (quitOrNot.equals("n")) {
						break;
					}
				}
			}
		}
		scanner.close();
	}
}