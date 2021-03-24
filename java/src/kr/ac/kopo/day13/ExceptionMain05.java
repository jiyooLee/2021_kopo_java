package kr.ac.kopo.day13;

import java.io.FileReader;

abstract class Parent {
	public abstract void print();
	public abstract void scan() throws Exception;
}

class Child extends Parent {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan() throws Exception {
		// TODO Auto-generated method stub
		
	}

		
}
public class ExceptionMain05 {

	public static void main(String[] args) {
		
		/*
		Child obj = new Child();
		obj.print();
		try {
			obj.scan();
		} catch(Exception e) {
			
		}
		
//		b();
		*/
		
		try {
			b();
		} catch(Exception e) {
			System.out.println("main() 예외처리..");
			e.printStackTrace();
		}
		
//		a();
	}
	
	public static void b() throws Exception {
		System.out.println("b() 메소드 호출...");
		String str = null;
		System.out.println(1 / 0);
		System.out.println(str.charAt(0));
	}
	
	public static void a() {
		System.out.println("a() 메소드 호출...");
		
		try {
			FileReader fr = new FileReader("a.txt");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
