package kr.ac.kopo.day10.homework;

public class HomeworkMain {

	public static void main(String[] args) {
		
		StringUtil util = new StringUtil();
		
		String str = "hello world";
		
		String revStr = util.reverseString(str);
		revStr = util.toUpperString(str);
		
		System.out.println("입력된 문자열 : " + str);
		System.out.println("변경된 문자열 : " + revStr);
		
		StringUtil.checkChar(str, 'o');
		
	}
}
