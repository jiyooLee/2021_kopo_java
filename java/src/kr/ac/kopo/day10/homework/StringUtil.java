package kr.ac.kopo.day10.homework;

public class StringUtil {

	public static int checkChar(String str, char c) {
		return 0;
	}
	
	/**
	 * 문자열을 거꾸로 변경하는 메소드
	 * @param  str 변경할문자열  "abcde"
	 * @return 변경된문자열  "edcba"
	 */
	public String reverseString(String str) {

		int length = str.length();
		char[] chars = new char[length];
		str.getChars(0, length, chars, 0);
		
		for(int i = 0, j = length-1; i < length/2; i++, j--) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
		
		/*
		StringBuffer sb = new StringBuffer();
		for(int i = str.length()-1, j = 0; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
		*/
		
		/*
		String revStr = new String();
		
		return revStr;
		*/
		
		/*
		char[] chars = new char[str.length()];
		for(int i = str.length()-1, j = 0; i >= 0; i--) {
			chars[j++] = str.charAt(i);
		}
		
		return new String(chars);
		*/
	}
	
	/**
	 * 문자열을 대문자로 변경하는 메소드
	 * @param str 
	 * @return 대문자로변경된 문자열
	 */
	public String toUpperString(String str) {
		
		char[] chars = new char[str.length()];
		str.getChars(0, str.length(), chars, 0);
		
		for(int i = 0; i < chars.length; i++) {
		//	if(isUpper(chars[i]))
			if(chars[i] >= 'a' && chars[i] <= 'z')
				chars[i] -= ('a' - 'A');
		}
		return new String(chars);
		
		/*
		byte[] bytes = new byte[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			byte b = (byte)str.charAt(i);
			// 소문자인경우 대문자로 변경해서 대입
			if(b >= 'a' && b <= 'z')
				b = (byte)(b - ('a' - 'A'));
			bytes[i] = b;
		}
		
		return new String(bytes);
		*/
	}

}













