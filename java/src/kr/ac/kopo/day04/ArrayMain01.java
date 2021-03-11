package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		int[] arr;
		
		arr = new int[5];		// arr[0] ~ arr[4]
		
		System.out.println("arr : " + arr + ", 원소개수 : " + arr.length);
		
		System.out.println("첫번째 정수 : " + arr[0]);
		System.out.println("두번째 정수 : " + arr[1]);
		System.out.println("세번째 정수 : " + arr[2]);
		System.out.println("네번째 정수 : " + arr[3]);
		System.out.println("다섯번째 정수 : " + arr[4]);
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(i+1 + "번째 정수 : " + arr[i]);
		}
		
		arr = new int[2];
		System.out.println("arr : " + arr + ", 원소개수 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 정수 : " + arr[i]);
		}
	}
}












