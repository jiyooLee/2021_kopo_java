package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * iodata/dog.jpg -> iodata/dog2.jpg 복사
 * 
 * 작업순서
 * 1. stream open
 * 2. read/write
 * 3. stream close
 */

public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			
			long start = System.currentTimeMillis();
			
		//   1. stream open
			fis = new FileInputStream("iodata/dog.jpg");
			fos = new FileOutputStream("iodata/dog2.jpg");
			
		//   2. read/write
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("복사완료...");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//	3. stream close
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}














