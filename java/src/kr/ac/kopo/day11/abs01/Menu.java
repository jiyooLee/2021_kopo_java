package kr.ac.kopo.day11.abs01;

import java.util.Scanner;

public class Menu {

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("LV1프린터를 선택하세요(1.LG  2.삼성) => ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	public void choice() {
		int type = selectMenu();
		print(type);
	}
	
	public void print(int no) {
		switch(no) {
		case 1: 
			LGPrinter lg = new LGPrinter();
//			lg.lgPrint();
			lg.print();
			break;
		case 2: 
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			break;
		}
	}
}






















