package kr.ac.kopo.service;

public class BoardServiceFactory {

	private static final BoardService service = new BoardService();
	
	public static BoardService getInstance() {
//		if(service == null)
//			service = new BoardService();
		return service;
	}
}
