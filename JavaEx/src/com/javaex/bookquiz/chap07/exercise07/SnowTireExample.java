package com.javaex.bookquiz.chap07.exercise07;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;	//	자동 타입 변환
		
		snowTire.run();
		tire.run();	//	부모타입으로 변환되었더라도 tire의 메소드 호출시 Override된 메소드 호출

	}

}
