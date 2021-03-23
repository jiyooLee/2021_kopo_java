package kr.ac.kopo.day12;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("main start....");
		
		Random r = new Random();
		int num = r.nextInt(3);	// 0 ~ 2 난수 발생
		System.out.println("num : " + num);
		
		String str = "hello";
		
		try {
			
			System.out.println(10 / num);
			System.out.println("첫번째 문자 : " + str.charAt(0));
		} catch(Exception e) {
			e.printStackTrace();
		}
/*		
		try {
			
			System.out.println(10 / num);
			System.out.println("첫번째 문자 : " + str.charAt(0));
		} catch(ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
*/		
/*		
		try {
			
			System.out.println(10 / num);
			System.out.println("첫번째 문자 : " + str.charAt(0));
		} catch(ArithmeticException ae) {
//			System.out.println("이유 : " + ae.getMessage());
			ae.printStackTrace();
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException 진입....");
		}
*/		
		System.out.println("main end....");
		
	}
}








