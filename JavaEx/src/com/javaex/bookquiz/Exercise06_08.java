package com.javaex.bookquiz;

public class Exercise06_08 {

	public static void main(String[] args) {
		int[][] array = { 
				{ 95, 86 }, 
				{ 85, 92, 96 }, 
				{ 78, 83, 93, 87, 88 }
				};
		
		int sum = 0;	//	전체 항목의 값
		double avg = 0.0;	//	평균 값
		
		int i,j;	// 카운터
		double count = 0.0;	// 변수 개수
		
		for ( i = 0; i < array.length; i++ ) {
			for ( j = 0; j < array[i].length; j++ ) {
				sum += array[i][j];
				count++;
			}
		} avg = sum / count; 
		

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
