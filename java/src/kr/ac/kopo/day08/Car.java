package kr.ac.kopo.day08;
/*
 * 생성자의 특징
 * 1. 클래스명 동일
 * 2. 반환형이 존재하지 않음
 * 3. 디폴트 생성자 지원
 * 4. 오버로딩 지원
 * 5. 객체의 초기화 담당
 */
public class Car {

	Car() {
		System.out.println("Car() 생성자 호출");
	}
	
	Car(String s) {
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(int i, String s) {
		System.out.println("Car(int, String) 생성자 호출");
	}
	
	void Car() {
		System.out.println("일반메소드 Car() 호출...");
	}
}













