package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "primitives.txt";
	
	//	DataStream: 기본 데이터 타입을 저장
	public static void main(String[] args) {
//		savePrimitives();
		loadPrimitives();
	}
	
	private static void loadPrimitives() {
		InputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(filename);
			dis = new DataInputStream(fis);
			
			//	입력 : String - Boolean - Int - Float
			for (int i = 0; i < 2; i++) {
				//	주의: 출력한 순서대로 입력할 것
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
//				String s = dis.readUTF();	//	출력한 순서대로 읽지 않으면 에러 발생!
				
				System.out.printf("%s:%b:%d:%f%n", s, b, val, f);
				}
			} catch ( FileNotFoundException e) {
				e.printStackTrace();
			} catch ( IOException e ) {
				e.printStackTrace();
			} finally {
				try {
					dis.close();
				} catch ( Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	
	
	private static void savePrimitives() {
		OutputStream fos = null;	//	주스트림
		DataOutputStream dos = null;	//	보조스트림
		
		try {
			fos = new FileOutputStream(filename);
			dos = new DataOutputStream(fos);
			
			//	출력 : String - Boolean - Int - Float
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(2021);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(38);
			dos.writeFloat(99.9f);
			
			
			
			System.out.println("데이터 저장 완료!");
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			try {
			dos.close();
		} catch ( Exception e ){
			e.printStackTrace();
		}
		
	}

}
	
}
