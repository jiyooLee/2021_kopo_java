package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO {

	private List<BoardVO> list;

	public BoardDAO() {
		list = new ArrayList<>();
	}
	
	public List<BoardVO> 전체게시글조회() throws Exception {

		return list;
	}
	
	public BoardVO 글번호조회(int no) throws Exception {
		
		for(BoardVO board : list) {
			if(board.getNo() == no)
				return board;
		}
		return null;
	}
	
	public void 새글등록(BoardVO newBoard) throws Exception  {
		list.add(newBoard);
	}
	
	public void 게시글수정(BoardVO board) throws Exception  {
		
		for(BoardVO vo : list) {
			if(vo.getNo() == board.getNo()) {
				vo.setTitle(board.getTitle());
				return;
			}
		}
	}
	
	public boolean 게시글삭제(int no) throws Exception {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == no) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	
}











