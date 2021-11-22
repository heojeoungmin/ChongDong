package com.board.service;

import java.util.HashMap;
import java.util.List;

public interface BoardService {
	
	List<HashMap<String, String>> getBoardList();
	
	//게시글 추가
	int insertBoards(HashMap<String, String> pMap);

	//게시글 수정
	int updateBoards(HashMap<String, String> pMap);
}