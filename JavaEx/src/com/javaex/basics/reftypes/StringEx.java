package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		stringType();
	}

	//	string type 연습
	private static void stringType() {
		//	문자열 선언
		String str;	//	선언
		str = "Java";	//	리터럴(소스에 직접 입력된 값)
		String str2 = "Java";	//	리터럴(str과 같은 String Pool의 "Java" 가리킴)
		String str3 = new String("Java");	//	새로운 메모리에 "Java"
		
		//	참조 타입에서 == 은 참조 주소가 같은지 (같은 객체인지) 판별
		System.out.println("str == str2 ? " + (str == str2));
		System.out.println("str == str3 ? " + (str == str3));
		
		//	값의 비교는? . equals()
		System.out.println("str, str2 내용이 같은가? " +
				str.equals(str2));
		System.out.println("str, str3 내용의 같은가? "+
				str.equals(str3));
		
		String str4;	//	선언 했으나 할당되지 않음
//		str4.equals(str4);	
		//	null 상태의 객체의 메서드를 이용하고자 하면 에러 발생
		//	NullPointerException 주의
		
	}
}
