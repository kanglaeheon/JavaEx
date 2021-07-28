package com.javaex.api.generic;

//	Generic 이용하기
//	T : Type의 준말
public class GenericBox<T> {
	T Content;

	public T getContent() {
		return Content;
	}

	public void setContent(T content) {
		Content = content;
	}
	
	
}
