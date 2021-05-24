package kr.ac.kopo.day16;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

/*
 *  FileIOMain08  원본파일명   복사파일명
 *  FileIOMain05  FileIOMain04.java   FileIOMain04.java.txt
 */
public class FileIOMain08 {

	public static void main(String[] args) {
	
		if(args.length != 2) {
			System.out.println("====================================================");
			System.out.println("\t사용법 : FileIOMain06  원본파일명  복사할파일명");
			System.out.println("====================================================");
			System.exit(0);
		}
		
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("iodata/" + args[0]);
			fw = new FileWriter("iodata/" + args[1]);
			
			while(true) {
				int c = fr.read();
				if(c == -1) break;
				fw.write(c);
			}
			fw.flush();
			System.out.println("파일 복사를 완료하였습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr, fw);
		}
	}
}
