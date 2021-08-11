package com.javaex.thread;

//	Thread 상속
public class DigitThread extends Thread {

	@Override
	public void run() {
		//	쓰레드의 실행 로직
		//	주의: 이 메서드는 직접 호출하지 말 것!
		for (int i = 1; i <= 30 ; i++) {
			System.out.printf("%s: %d%n", getName(), i);
			
			try {
				Thread.sleep(300);	//	300ms = 0.3s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
