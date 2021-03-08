package kr.ac.kopo.day01;

/*
 	출력메소드
 	
 	System.out.print()
 	System.out.println()
 	System.out.printf()		:  jdk 1.5
 	     %[-][간격]알파벳
 	     %[전체자리수][.소수점이하자리수]f
 	     정수		%d
 	     실수		%f
 	     문자		%c
 	     문자열		%s
 	     논리값		%b
 */

public class HelloMain {

	public static void main(String[] args) {
				
		System.out.println(10.0/3.0);
		System.out.printf("%.2f\n", 10.0 / 3.0);
	
		System.out.printf("%-15s\t%6d\n", "빼빼로", 1500);
		System.out.printf("%-15s\t%6d\n", "빠다코코넛", 2000);
		System.out.printf("%-15s\t%6d\n", "초코로만든 홈런볼", 2000);
		
		System.out.println("빼빼로" + "\t" + 1500);
		System.out.println("빠다코코넛" + "\t" + 2000);
		System.out.println("초코로만든 홈런볼" + "\t" + 2000);
		
		System.out.print(10 + "\n" + 20);
		System.out.println();
		System.out.printf("%d%c%d", 10, '\n', 20);
		
	
		
	}
}
