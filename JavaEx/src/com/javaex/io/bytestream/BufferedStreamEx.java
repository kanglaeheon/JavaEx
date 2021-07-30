package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "Img_bufferedcopy.jpg";
	
	public static void main(String[] args) {
			
		InputStream fis = null;
		OutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(target);
			
			//	버퍼 기반 보조 스트림
			bis = new BufferedInputStream(fis);	//	입력 보조 스트림
			bos = new BufferedOutputStream(fos);	//	출력 보조 스림
			
//			int data = 0;
			byte[] data = new byte[10240];	//	버퍼
			int size = 0;	//	읽은 사이즈
			
			while((size = bis.read(data)) != -1) {	//	버퍼에 읽어들일 데이터가 없을 때까지
				bos.write(data, 0, size);	//	버퍼에 담긴 내용을 (버터 0부터 size까지)배열로 출력
				System.out.println(size + "바이트 복사!");
			}
			
			bos.flush();
			
			System.out.println("파일 복사 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();	//	연결된 주스트림도 닫힌다
				bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}

}
