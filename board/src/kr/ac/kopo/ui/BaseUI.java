package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.service.BoardServiceFactory;

public abstract class BaseUI implements IBoardUI {

	private Scanner sc;
	protected BoardService service;

	public BaseUI() {
		sc = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();
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











