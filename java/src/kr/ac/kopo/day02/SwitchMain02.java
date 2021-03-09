package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 좋아하는 계절을 입력 : spring
 * 봄은 3월 ~ 5월까지입니다
 */
public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 계절을 입력 : ");
		String season = sc.nextLine();
		
		switch(season) {
		case "spring" : 
			System.out.println("봄은 3월 ~ 5월까지입니다");
			break;
		case "summer" : 
			System.out.println("여름은 6월 ~ 8월까지입니다");
			break;
		default : 
			System.out.println("error");
		}
		
		/*
		if(season.equals("spring")) {
			System.out.println("봄은 3월 ~ 5월까지입니다");
		} else if(season.equals("summer")) {
			System.out.println("여름은 6월 ~ 8월까지입니다");
		} else {
			System.out.println("error");
		}
		*/
	}
}












