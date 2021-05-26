package kr.ac.kopo.ui;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		int no = scanInt("수정할 글번호를 입력하세요 : ");
		String title = scanStr("수정할 제목을 입력하세요  :");
		
		System.out.println("게시글 수정을 완료하였습니다");
	}

}
