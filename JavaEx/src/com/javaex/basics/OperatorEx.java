package com.javaex.basics;

public class OperatorEx {
	public static void main(String[] args) {
		arithOperEx();
	}

	//	산술 연산
	private static void arithOperEx() {
		int a = 7, b = 3;
		
		//	부호 연산자 : +, -
		System.out.println(-a);
		
		//	사칙연산 : +, -, *, /
		System.out.println(a / b); // int / int => int
		System.out.println(a % b); // 정수 나눗셈의 나머지
		
		//	실제 해 구하기
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b); // 두 개의 다른 데이터타입 연산 수행할 때, 표현범위가 큰 쪽으로 자동 타입 변환
		
		//	증감 연산자: ++, --
		//	전치 증감(++a 등), 후치 증감(b--) 혼동하지 말자
		
		int num = 10;
		//	전치 증감
		System.out.println("num:" + num);
		System.out.println("++num:" + ++num);
		System.out.println("num:" + num);
		
		//	후치 증감
		System.out.println("num:" + num);
		System.out.println("num++:" + num++);
		System.out.println("num:" + num);
		
		//	나눗셈 보충
//		System.out.println(4 / 0); // ArithmeticException
		System.out.println(4.0 / 0);	//	Infinity
		System.out.println(4.0 / 0 + 10);	//	Infinity 포함된 연산 -> Infinity
		System.out.println(0.0 / 0.0);	// NAN(Not a Number)
		
		// 우리의 연산식의 결과가 Infinity인지 확인
		System.out.println(Double.isInfinite(4.0 / 0));	//	Infinity인가?
		System.out.println(Double.isNaN(0.0 / 0.0));	//	NaN인가?
		System.out.println("End of Code");
	}
	
}
