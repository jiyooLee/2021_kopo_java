package kr.ac.kopo.ui;

import java.util.Scanner;

public abstract class BaseUI implements IBoardUI {

	private Scanner sc;

	public BaseUI() {
		sc = new Scanner(System.in);
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	protected int scanInt(String msg) {
		int num = Integer.parseInt(scanStr(msg));
		return num;
	}
}











