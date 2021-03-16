package kr.ac.kopo.day07;

/*
 	**********
 	hello
 	**********
 	hi
 	**********
 	good-bye
 	**********
 */

public class MethodMain01 {
	
	/**
	 * 임의의 문자를 반복하여 출력하는 기능
	 * @param c 출력할 문자
	 * @param cnt 출력회수
	 */
	
	static int printStar(char c, int cnt)  {
		
		for(int i = 0; i < cnt; i++) {
			System.out.print(c);
		}
		System.out.println();
		
		return 10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		int data = printStar('*', 10);
		System.out.println("Hello");
		printStar('!', 20);
		System.out.println("Hi");
		printStar('#', 5);
		System.out.println("Good-bye");         
		printStar('-', 12);
	}
}










