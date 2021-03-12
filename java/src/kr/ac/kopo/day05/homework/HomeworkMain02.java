package kr.ac.kopo.day05.homework;

import java.util.Random;

public class HomeworkMain02 {

	public static void main(String[] args) {
		Random r = new Random();
		
		// 1 ~ 100사이의 정수를 4개 추출
		int num = r.nextInt(100) + 1;	// (0 ~ 99) + 1 => (1 ~ 100)
		int num2 = r.nextInt(100) + 1;	// (0 ~ 99) + 1 => (1 ~ 100)
		int num3 = r.nextInt(100) + 1;	// (0 ~ 99) + 1 => (1 ~ 100)
		int num4 = r.nextInt(100) + 1;	// (0 ~ 99) + 1 => (1 ~ 100)
		System.out.println(num + ", " + num2 + ", " + num3 + ", " + num4);
		
		int max = num > num2 ? num : num2;
		if(max < num3) {
			max = num3;
		}
		if(max < num4) {
			max = num4;
		}
		System.out.println("가장 큰수 : " + max);		
		
		/*
		int max1 = num > num2 ? num : num2;
		int max2 = num3;
		if(num4 > num3) {
			max2 = num4;
		}
		
		System.out.println("가장 큰수 : " + (max1 > max2 ? max1 : max2));
		*/
	}
}











