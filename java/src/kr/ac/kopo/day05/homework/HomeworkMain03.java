package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4개의 정수를 입력 : ");
		int max = 0;
		for(int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			if(i == 0 || max < num) {
				max = num;
			}
		}
		System.out.println("가장 큰수 : " + max);
	}
}
