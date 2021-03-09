package kr.ac.kopo.day02;

public class OperationMain02 {

	public static void main(String[] args) {
		int a = 1, b = -1, c = 0;
		
		boolean bool = a++ > 0 || b++ >= 0 && c++ > 0;
		
		System.out.println("bool : " + bool);
		
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
	}
}
