package com.coment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coment.service.impl.ComentServiceImpl;

@Controller
public class ComentController {
	
	//사용되는 서비스 선언
	@Autowired
	ComentServiceImpl comentService;
	
	//ajax 호출  댓글 작성
	@ResponseBody
	@RequestMapping(value="/insertComent.do")
	private Map<String, Object> insertComent(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = comentService.insertComent(map);
	
		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("insertComent", check);
			
		return reqMap;
	}
	
	//ajax 호출  댓글 수정
	@ResponseBody
	@RequestMapping(value="/updateComent.do")
	private Map<String, Object> updateComent(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = comentService.updateComent(map);
	
		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("updateComent", check);
			
		return reqMap;
	}
		
	//ajax 호출  댓글 삭제
	@ResponseBody
	@RequestMapping(value="/deleteComent.do")
	private Map<String, Object> deleteComent(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = comentService.deleteComent(map);
	
		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("deleteComent", check);
			
		return reqMap;
	}
}
