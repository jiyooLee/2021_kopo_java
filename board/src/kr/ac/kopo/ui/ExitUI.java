package kr.ac.kopo.ui;

public class ExitUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("=============================");
		System.out.println("\n\t게시판 관리프로그램 종료합니다\n");
		System.out.println("=============================");
		System.exit(0);
	}

}
