package com.javaex.basics.reftypes;

public class MainArgs {

	public static void main(String[] args) {
		//	args: 커맨드 라인에서 인자값으로 들어온 값
		//		-> 배열로 전달
		
		System.out.printf("%d개의 인자가 전달%n", 
				args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.printf("인수 %d, %s%n",
					i, args[i]);
			
		//	프로젝트 우클릭 -> Export -> 필터 텍스트 : jr -> Java -> JAR File
		//	-> export destination 설정 -> Seal some packages -> 내보낼 패키지 선택
		//	-> Main class 선택 -> cmd 
		//	-> java -jar MainArgs.jar Java Programming Language
			
		//	MainArgs 우클릭 -> Run As -> run Configuration > Arguments 탭
		}

	}

}
