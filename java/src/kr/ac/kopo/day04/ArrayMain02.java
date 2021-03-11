package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		// 1, 2, 3, 4, 5를 가지는 배열 arr를 생성
		/*
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		*/

		/*
		int[] arr = {1, 2, 3, 4, 5};
		*/
		
		int[] arr = new int[] {1, 2, 3, 4, 5};

		arr = new int[] {10, 20, 30, 40, 50, 60, 70};
		
		// arr배열의 원소 출력
		/*
		 * 배열의 전체 요소를 출력하는 방식 3가지
		 * 1. 인덱스를 이용한 출력
		 * 2. 1.5버전의 for문을 이용한 출력
		 * 3. java.util.Arrays.toString() 메소드를 이용한 출력
		 */
		System.out.println("< 방식1 >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
		
		System.out.println("< 방식2 >");
		for(int num : arr) {
			System.out.print(num + "   ");
		}
		System.out.println();
	
		System.out.println("< 방식3 >");
		System.out.println(Arrays.toString(arr));
	}
}







