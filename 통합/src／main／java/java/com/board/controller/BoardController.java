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
	
	@ResponseBody
	@RequestMapping(value="/getBoardList2.do")
	private Map<String, Object> getBoardList2(@RequestBody HashMap<String, String> map) {
		
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		List<HashMap<String,String>> results = boardService.getBoardList2();
		
		reqMap.put("boardList", results);
		
		return reqMap;
	}
	
	
	
}
