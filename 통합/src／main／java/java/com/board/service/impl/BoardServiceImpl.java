package com.board.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.model.BoardMapper;
import com.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	//BoardServiceImpl
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<HashMap<String, String>> getBoardList() {
		
		List<HashMap<String, String>> results = boardMapper.selectBoardList();
		
		return results;
	}
	
	//게시글 추가
	@Override
	public int insertBoards(HashMap<String, String> pMap) {
		
		int results = boardMapper.insertBoards(pMap);
		
		return results;
	}
	
	//게시글 수정
	@Override
	public int updateBoards(HashMap<String, String> pMap) {
		
		int results = boardMapper.updateBoards(pMap);
		
		return results;
	}
}
