package kr.ac.kopo.day11;

public class Child02 extends Parent {

	/* private */String name = "자식02";
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다");
	}
	
	public void play() {
		System.out.println("나는 놉니다");
	}
	
	@Override
	public void info() {
		System.out.println("Child02 클래스에서 재정의된 메소드...");
	}
}
