package kr.ac.kopo.day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CastMain01 {
	
	/*
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c) {
		c.info();
	}
	*/
	public static void print(Parent p) {
		
		p.info();
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.sleep();
			c.study();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		}
		
		/*
		System.out.println("p instanceof Child01 : " + (p instanceof Child01) );
		System.out.println("p instanceof Child02 : " + (p instanceof Child02) );
		System.out.println("p instanceof Parent : " + (p instanceof Parent) );
		*/
	}
	
	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		print(c01);
		
		
		Child02 c02 = new Child02();
		print(c02);
		
		Parent p = new Parent();
		print(p);
		
		/*
		Parent p = new Child01();	// 묵시적형변환
		System.out.println(p.name + ", " + p.age);
		p.info();
		*/
		
		/*
		Child01 c01 = new Child01();
		System.out.println(c01.name + ", " + c01.age);
		c01.info();
		
		Parent p = new Parent();
		System.out.println(p.name + ", " + p.age);
		p.info();
		*/

	}
}









