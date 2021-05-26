package kr.ac.kopo.ui;

public class SearchOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("조회할 글번호를 입력하세요 : ");
		
		System.out.println("---------------------------------");
		System.out.println("\t번    호 : ");
		System.out.println("\t제    목 : ");
		System.out.println("\t글 쓴 이 : ");
		System.out.println("\t등 록 일 : ");
		System.out.println("---------------------------------");
		
	}

}
