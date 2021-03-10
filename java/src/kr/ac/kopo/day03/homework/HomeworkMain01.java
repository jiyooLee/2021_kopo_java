package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("정수 " + num + "이 " + num2 + "의 배수 여부 판단 : " 
				+ (num2 > 0 && num % num2 == 0)  );

		System.out.println("정수 " + num + "이 " + num2 + "의 배수 여부 판단 : " 
				+ (num2 > 0 && num % num2 == 0 ? "참" : "거짓")  );
		
	}
}








