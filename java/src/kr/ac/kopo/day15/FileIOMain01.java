package kr.ac.kopo.day15;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args)  {
		
		System.out.println("입력을 하세요. ctrl+z를 누르면 종료합니다");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		try {
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		InputStream is = System.in;
		while(true) {
			int c = is.read();
			if(c == -1) break;
			System.out.print((char)c);
		}
		*/
	}
}
