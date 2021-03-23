package kr.ac.kopo.day12;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("main start....");
		
		Random r = new Random();
		int num = r.nextInt(3);	// 0 ~ 2 난수 발생
		System.out.println("num : " + num);
		
		System.out.println(10 / num);
		
		System.out.println("main end....");
		
	}
}
