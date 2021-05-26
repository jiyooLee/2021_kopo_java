package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class SearchAllUI extends BaseUI{

	@Override
	public void execute() throws Exception {

		List<BoardVO> list = service.전체게시글조회서비스();
		
		System.out.println("-----------------------------------------");
		System.out.println("\t전체 게시글 조회");
		System.out.println("-----------------------------------------");
		System.out.println("번호\t글쓴이\t등록일\t제목");
		System.out.println("-----------------------------------------");
		if(list.size() == 0) {
			System.out.println("\t조회할 게시물이 없습니다");
		} else {
			for(BoardVO board : list) {
				System.out.println(board.getNo() + "\t" + board.getWriter() + "\t"
								+ board.getRegDate() + "\t" + board.getTitle());
			}
		}
		System.out.println("-----------------------------------------");
	}

}







