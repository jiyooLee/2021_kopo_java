package kr.ac.kopo.day14;

import java.util.Random;

class A {
	private Object obj;

	public A(Object obj) {
		this.obj = obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : " + obj);
	}
	
	
}

class B<T> {
	private T obj;
	
	public B(T obj) {
		this.obj = obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : " + obj);
	}
}

public class GenericMain {

	public static void main(String[] args) {
		
		B<String> b01 = new B<String>(new String("Hello"));
		B<Random> b02 = new B<Random>(new Random());
		
		b01.info();
		b02.info();
		
		System.out.println("길이 : " + b01.getObj().length());
		System.out.println("난수 : " + b02.getObj().nextInt());
		
//		b01 = new B<Random>(new Random());
		
		
		A a01 = new A(new String("hello"));
		A a02 = new A(new Random());
		
		a01.info();
		a02.info();
	
		
		System.out.println("길이 : " + ((String)a01.getObj()).length());
		System.out.println("난수 : " + ((Random)a02.getObj()).nextInt());
		
		A[] arr = new A[2];
		arr[0] = a01;
		arr[1] = a02;
		
	}
}














