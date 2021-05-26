package kr.ac.kopo;

import kr.ac.kopo.ui.BoardUI;

public class BoardMain {

	public static void main(String[] args) {
		
		BoardUI ui = new BoardUI();
		try {
			ui.execute();
		} catch(Exception e) {
			System.out.println("main catch....");
			e.printStackTrace();
		}
	}
}
