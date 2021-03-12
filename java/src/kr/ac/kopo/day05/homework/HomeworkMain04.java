package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		int i = 2;
		while(i <= num && num % i != 0) {
			i++;
		}
		
		if(i == num) { 
			System.out.println(num + " : 소수입니다 ");
		} else {
			System.out.println(num + " : 소수가 아닙니다");
		}
		
		/*
		boolean bool = true;
		for(int i= 2; i <= num/2; i++) {
			if(num % i == 0) {
				bool = false;
				break;
			}
		}
		if(bool) {
			System.out.println(num + " : 소수입니다" );
		} else {
			System.out.println(num + " : 소수가 아닙니다");
		}
		*/
		/*
		// 1과 자기자신의 정수를 제외한 약수개수 구하기(소수는 약수0개)
		int count = 0;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println(num + " : 소수입니다");
		} else {
			System.out.println(num + " : 소수가 아닙니다");
		}
		*/
		
		
		/*
		// 1과 자기자신의 정수를 제외한 약수개수 구하기(소수는 약수0개)
		int count = 0;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println(num + " : 소수입니다");
		} else {
			System.out.println(num + " : 소수가 아닙니다");
		}
		*/
		
		/*
		// 정수의 약수개수 구하기(소수는 약수2개)
		// 정수의 약수가 될수 있는 후보군 : 1 ~ 정수
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + " : 소수입니다");
		} else {
			System.out.println(num + " : 소수가 아닙니다");
		}
		*/
	}
}













