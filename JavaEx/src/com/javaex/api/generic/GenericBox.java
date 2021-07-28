package com.javaex.api.generic;

//	Generic 이용하기
//	T : Type의 준말

//	파라미터 갯수는 제한이 없다
//	주로 사용되는 파라미터 관례:
//	T : Type
//	R : Return Type
//	K : Key
//	V : Value

public class GenericBox<T> {
	T Content;

	public T getContent() {
		return Content;
	}

	public void setContent(T content) {
		Content = content;
	}
	
	
}
