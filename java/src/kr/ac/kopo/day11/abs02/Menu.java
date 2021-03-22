package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu {

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("LV2프린터를 선택하세요(1.LG  2.삼성  3.HP) => ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	public void choice() {
		int type = selectMenu();
		print(type);
	}
	
	public void print(int no) {
		
		Printer p = null;
		
		switch(no) {
		case 1: 
			p = new LGPrinter();
			break;
		case 2: 
			p = new SamsungPrinter();
			break;
		case 3 : 
//			p = new HPInkjetPrinter();
			p = new HPLaserPrinter();
			break;
		}
		if(p != null)
			p.print();
		else {
			System.out.println("잘못선택하셨습니다");
		}
		
		/*
		switch(no) {
		case 1: 
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case 2: 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case 3 : 
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		}
		*/
	}
}






















