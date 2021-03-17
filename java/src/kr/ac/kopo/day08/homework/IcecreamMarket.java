package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] iceArr;
	Scanner sc = new Scanner(System.in);
	
	int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String inputString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	void doSomething() {
		// 손님 아이스크림 구매
		buy();
		
		// 구매정보 출력
		info();
	}
	
	void info() {
		System.out.println("< 총 " + iceArr.length + "개 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		int no = 1;
		for(Icecream ice : iceArr) {
			System.out.print(no++ + "\t");
			ice.print();
//			System.out.println(no++ + "\t" + ice.getName() + "\t" + ice.getPrice());
//			System.out.println(no++ + "\t" + ice.name + "\t" + ice.price);
		}
	}
	
	
	void buy() {
		int count = inputInt("아이스크림 몇개 구입할래? : ");
		iceArr = new Icecream[count];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			String name = inputString("아이스크림명 : ");
			int price = inputInt("아이스크림가격 : ");
			
			iceArr[i] = new Icecream();
			iceArr[i].set(name, price);
		}
		
	}
}













