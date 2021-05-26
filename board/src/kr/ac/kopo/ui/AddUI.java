package kr.ac.kopo.ui;

public class AddUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String title = scanStr("등록할 제목을 입력하세요 : ");
		String writer = scanStr("등록할 글쓴이를 입력하세요 : ");
		
		
		throw new Exception("게시글등록 예외발생!!!");
//		System.out.println("게시글 등록을 완료하였습니다");
	}

}
