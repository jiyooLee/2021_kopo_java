package kr.ac.kopo.day11;

public class Parent {

	// ctrl+shift+/ 다중주석 on    ctrl+shift+\  다중주석 off
	/* private */String name = "부모";
	/* private */int age = 50;
	
	public void info() {
		System.out.println("name : " + name + ", age : " + age);
	}
}
