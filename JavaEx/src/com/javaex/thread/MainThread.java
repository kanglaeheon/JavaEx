package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 호출
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		//	쓰레드 시작: run 메서드 직접 호출하지 말자!
		thread.start();
				
		//	MainThread 로직
//		for (char ch = 'A'; ch <= 'Z' ; ch++) {
//			System.out.println("Main Thread:" + ch);
//			
//			try {
//				Thread.sleep(300);	//	300ms = 0.3s
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		Thread thread2 = new Thread(new AlphabetThread());
		thread2.start();
		
		//	MainThread의 흐름에 WorkingThread들의 흐름을 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of MainThread!");
	}
	
}
