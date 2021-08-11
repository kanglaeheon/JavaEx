package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory();	//	공유 객체
		
		User user1 = new User("철수", memory, 100);	//	첫 번째 쓰레드
		User user2 = new User("영희", memory, 50);	//	두 번째 쓰레드
		
		user1.start();
		user2.start();
		
//		try {
//			user1.join();
//			user2.join();
//			
//			System.out.println("End of Thread");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}

}