package kr.ac.kopo.day02;

public class ConstMain02 {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		ch = 65;
		
		ch = '\u0041';
		
//		ch = '\uAC00';
		
		System.out.println(ch);
		System.out.println((int)ch);		// 형변환
		
		int code = ch;
		System.out.println(code);
		
		System.out.println("문자 : " + ch);
		
		System.out.println("" + 'A' + 'B');
	}
}
