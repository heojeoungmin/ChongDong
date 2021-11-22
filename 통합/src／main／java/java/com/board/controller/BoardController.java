package com.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.service.impl.BoardServiceImpl;

@Controller
public class BoardController {
	
	//사용되는 서비스 선언
	@Autowired
	BoardServiceImpl boardService;
	
	/* 게시판 호출 */
	@RequestMapping(value="/board.do")
	public String main() {
		return "board/board";
	}
	
	@ResponseBody
	@RequestMapping(value="/getBoardList.do")
	private Map<String, Object> getBoardList(@RequestBody HashMap<String, String> map) {
		
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		//서비스 호출
		List<HashMap<String,String>> results = boardService.getBoardList();
		
		reqMap.put("boardList", results);
		
		return reqMap;
	}
	
	//ajax 호출  게시글 추가 
	@ResponseBody
	@RequestMapping(value="/insertBoards.do")
	private Map<String, Object> createMenu(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = boardService.insertBoards(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("insertBoards", check);
			
		return reqMap;
	}
	
	//ajax 호출 게시글 수정
	@ResponseBody
	@RequestMapping(value="/updateBoards.do")
	private Map<String, Object> updateBoards(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = boardService.updateBoards(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("updateBoards", check);
			
		return reqMap;
	}
}
