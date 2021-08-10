package com.javaex.jdbc.oracle.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {
//		listAuthors();
//		insertAuthor();
//		updateAuthor();
//		deleteAuthor();
		searchAuthor();
	}
	
	private static void searchAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색어:");
		String keyword = scanner.next();
		
		AuthorDAO dao = new AuthorDAOImpleOracle();
		
		List<AuthorVO> list = dao.search(keyword);
		Iterator<AuthorVO> it = list.iterator();
		
		while(it.hasNext()) {
			AuthorVO vo = it.next();
			System.out.printf("%d\t%s\t%s%n",
					vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
		}
		scanner.close();
	}
	
	private static void deleteAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("저자번호:");
		long authorID = scanner.nextLong();
		
		AuthorDAO dao = new AuthorDAOImpleOracle();
		
		boolean success = dao.delete(authorID);
		
		System.out.println("Author DELETE:" + (success ? "성공" : "실패"));
		scanner.close();
	}
	
	private static void updateAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("저자번호:");
		long authorID = scanner.nextLong();
		System.out.print("이름:");
		String name = scanner.nextLine();
		System.out.print("경력:");
		String desc = scanner.nextLine();
		
		AuthorVO vo = new AuthorVO(authorID, name, desc);
		
		AuthorDAO dao = new AuthorDAOImpleOracle();
		
		boolean success = dao.update(vo);
		
		System.out.println("Author UPDATE:" + (success ? "성공" : "실패"));
		scanner.close();
	}
	
	private static void insertAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름:");
		String name = scanner.nextLine();
		System.out.print("경력:");
		String desc = scanner.nextLine();
		
		AuthorVO vo = new AuthorVO(name, desc);
		
		AuthorDAO dao = new AuthorDAOImpleOracle();
		
		boolean success = dao.insert(vo);
		
		System.out.println("Author INSERT:" + (success ? "성공" : "실패"));
		scanner.close();
	}
	private static void listAuthors() {
		AuthorDAO dao = new AuthorDAOImpleOracle();
		
		List<AuthorVO> list = dao.getList();
		Iterator<AuthorVO> it = list.iterator();
		
		while(it.hasNext()) {
			AuthorVO vo = it.next();
			System.out.printf("%d\t%s\t%s%n",
					vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
		}
		System.out.println("---------------------");
	}
}
