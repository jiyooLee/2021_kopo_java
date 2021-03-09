package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
 * 집에서 출발한 시간 8시 이전 : 걸어서
 *                8시 15분 이전 : 버스타고
 *                8시 15분 이후 : 택시타고
 *                
 *  집에서 출발한 시간 입력(8시 5분은 805입력) : 756
 *  걸어서 융기원 온다 
 */

public class ExamMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("집에서 출발한 시간 입력(8시 5분은 805입력) : ");
		int time = sc.nextInt();
		
		System.out.println(time);
		
	}
}
