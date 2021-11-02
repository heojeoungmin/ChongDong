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
	
	@Override
	public List<HashMap<String, String>> getBoardList2() {
		
		List<HashMap<String, String>> results = boardMapper.selectBoardList2();
		
		return results;
	}
	
}
