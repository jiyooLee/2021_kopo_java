package kr.ac.kopo.day08;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		char[] chars = new char[str.length()];
		/*
		for(int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		*/		
		//str.getChars(0, str.length(), chars, 0);
		/*
		int loc = 0;
		for(int i = 3; i < 9; i++) {
			chars[loc++] = str.charAt(i);
		}
		*/
		str.getChars(3, 9, chars, 0);
		System.out.println("chars : " + Arrays.toString(chars));
		
		System.out.println("[" + str + "]의 길이 : " + str.length());
		System.out.println("0번째에 위치한 문자 : " + str.charAt(0));
		System.out.println("7번째에 위치한 문자 : " + str.charAt(7));
		
	//	Scanner sc = new Scanner(System.in);
	//	System.out.print("문자를 입력 : ");
	//	char c = sc.nextLine().charAt(0);
		
		
	}
}








