package kr.ac.kopo.day09;

public class StringMain03 {

	public static void main(String[] args) {
		
		String str = new String("hello");
		String str2 = new String("HELLO");
		
//		String str = "hello";
//		String str2 = "hello";
		
		System.out.println("str  : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		// 주소비교
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		// 문자열 비교
		boolean bool = str.equals(str2);
		if(bool) {
			System.out.println("equals() : str == str2");
		} else {
			System.out.println("equals() : str != str2");
		}
		
		bool = str.equalsIgnoreCase(str2);
		if(bool) {
			System.out.println("equalsIgnoreCase() : str == str2");
		} else {
			System.out.println("equalsIgnoreCase() : str != str2");
		}
		
		str = "hell!!";
		str2 = "hello world";
		
		String sub = "hello";
		bool = str.startsWith(sub);
		if(bool) {
			System.out.println("[" + str + "]은 [" + sub + "]문자열로 시작합니다" );
		} else {
			System.out.println("[" + str + "]은 [" + sub + "]문자열로 시작하지 않습니다" );
		}
		
		str = "hello.txt";
		bool = str.endsWith(".txt");
		if(bool) {
			System.out.println("[" + str + "]은 텍스트파일입니다");
		} else {
			System.out.println("[" + str + "]은 텍스트파일이 아닙니다");
		}
		
		str = "boat";
		str2 = "board";
		
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + " == " + str2);
		} else if(compare < 0) {
			System.out.println(str + " < " + str2);
		} else { // copmare > 0
			System.out.println(str + " > " + str2);
		}
		
		String[] names = {"강길동", "홍길동", "홍길순", "김길동", "윤길동", "박홍철", "홍길동"};
		
		System.out.println("< 이름이 홍길동인 사람 검색 >");
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("홍길동"))
				System.out.println(names[i]);
		}
		
		System.out.println("< 홍씨성을 가진 사람 검색 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 길동인 사람 검색 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 홍이 포함된 사람 검색 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		str = "hello world";
		
		System.out.println("문자열 : " +  str);
		
		int searchIdx = str.indexOf("p");
		System.out.println("\"p\" indexOf() 위치 : " + searchIdx);
		
		searchIdx = str.indexOf("o");
		System.out.println("\"o\" indexOf() 위치 : " + searchIdx);
		
		searchIdx = str.indexOf("o", 5);
		System.out.println("\"o\" indexOf(5) 위치 : " + searchIdx);
		
		searchIdx = str.lastIndexOf("o");
		System.out.println("\"o\" lastIndexOf() 위치 : " + searchIdx);
		
		str = "hello world";
		char ch = 'l';
		System.out.println("<" + str + "에서 " + ch + " 위치 >");
		searchIdx = str.indexOf(ch);
		while(searchIdx != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
			searchIdx = str.indexOf(ch, searchIdx+1);
		}
		//===============================================
		
		System.out.println("<" + str + "에서 " + ch + " 위치 >");
		searchIdx = -1;
		while((searchIdx = str.indexOf(ch, searchIdx+1)) != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
		}
	}
}
























