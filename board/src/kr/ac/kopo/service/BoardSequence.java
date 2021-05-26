package kr.ac.kopo.service;

public class BoardSequence {

	private static int no = 1;
	
	public static synchronized int getNo() {
		return BoardSequence.no++;
	}
}
