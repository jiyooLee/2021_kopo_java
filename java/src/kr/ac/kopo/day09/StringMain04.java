package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "hello world";
		
		System.out.println("str : " + str);
		
		String subStr = str.substring(1, 5);
		System.out.println("substring(1,5) : [" + subStr + "]");
		
		subStr = str.substring(6);
		System.out.println("substring(6) : [" + subStr + "]");
		
		String str1 = "hello";
		String str2 = "!!!!";
		
//		str = str1 + str2;
		str = str1.concat(str2);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("concat(str1, str2) 결과 : " + str);
		
		str = "hello world";
		System.out.println("replace() 전 : " + str);
//		str = str.replace('l', 'r');
		str = str.replace("ll","rrrrrr");
		System.out.println("replace() 후 : " + str);
		
		str = "      hello  world      ";
		System.out.println("trim() 전 [" + str + "] 길이 : " + str.length());
		str = str.trim();
		System.out.println("trim() 후 [" + str + "] 길이 : " + str.length());
		
		str = "Hello World!!!";
		System.out.println("str : " + str);
		System.out.println("toLowerCase() : " + str.toLowerCase());
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		str = "홍길동전:허균:조선시대";
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		String ip = "192.168.5.203";
		String[] ipArr = ip.split("\\.");
		System.out.println(Arrays.toString(ipArr));
		
		int num = 123;
//		String strNum = num + "";
		String strNum = String.valueOf(num);
		
		
		System.out.println(strNum + 10);
		System.out.println(String.valueOf(true) + false);
	}
}











