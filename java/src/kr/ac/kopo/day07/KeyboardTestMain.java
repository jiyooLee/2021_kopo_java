package kr.ac.kopo.day07;

import java.util.Scanner;

public class KeyboardTestMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
		
//		String data = sc.nextLine();	// data = "123"
//		int num = Integer.parseInt(data);
		
		int num = Integer.parseInt(sc.nextLine());	// "123" => 123
		
		
		
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("str : " + str + ", num : " + num);
	}
}
