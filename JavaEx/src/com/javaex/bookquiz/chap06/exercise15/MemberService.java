package com.javaex.bookquiz.chap06.exercise15;

public class MemberService {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		
		public boolean login(String id, String password) {
			if ("hong".equals(id) && "12345".equals(password) ) {
				return true; 
			} else {
				return false;
			}
		}
		
		public void logout(String id) {
			if ("hong".equals(id)) {
				System.out.println("로그아웃 되었습니다.");
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
			}
			
		}
	}
