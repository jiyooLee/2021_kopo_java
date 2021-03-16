package kr.ac.kopo.day07;

import java.util.Scanner;

/**
 * 구구단과 관련된 여러가지 기능을 가지는 기능클래스
 * @author da
 *
 */
public class Gugudan {

	Scanner sc = new Scanner(System.in);
	
	void print(int dan) {
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		System.out.println();
	}
	
	void print() {
		
		print(2, 9);
		
		/*
		for(int dan = 2; dan <= 9; dan++) {
			print(dan);
		}
		*/
/*		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println();
		}
*/		
	}
	
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param sDan 시작단
	 * @param eDan 종료단
	 */
	void print(int sDan, int eDan) {
		
		for(int dan = sDan; dan <= eDan; dan++) {
			print(dan);
		}
	}
	
	int getDan() {
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	int getDan(String msg) {
		System.out.print(msg);
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
}












