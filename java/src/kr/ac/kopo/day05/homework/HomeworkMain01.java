package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력하세요 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int min = num, max = num2;
		if(num > num2) {
			min = num2;
			max = num;
		}
		
		if(num3 > max) {
			System.out.println(num3 + " > " + max + " > " + min);
		} else if(num3 > min) {
			System.out.println(max + " > " + num3 + " > " + min);
		} else {
			System.out.println(max + " > " + min + " > " + num3);
		}
		
	}
}








