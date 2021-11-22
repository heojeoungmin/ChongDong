package com.menu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.menu.service.impl.MenuServiceImpl;

@Controller
public class MenuController {
	
	@Autowired
	MenuServiceImpl menuService;
	
	//ajax 호출 메뉴 조회
	@ResponseBody
	@RequestMapping(value="/getMenuList.do")
	private Map<String, Object> getMenuList(@RequestBody HashMap<String, String> map) {
		
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		List<HashMap<String,String>> results = menuService.selectMenuList(map);
		
		reqMap.put("menuList", results);
		
		return reqMap;
	}
	
	//ajax 호출  메뉴추가 
	@ResponseBody
	@RequestMapping(value="/createMenu.do")
	private Map<String, Object> createMenu(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = menuService.insertMenu(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("createMenu", check);
			
		return reqMap;
	}
	
	//ajax 호출  메뉴 변경
	@ResponseBody
	@RequestMapping(value="/updateMenu.do")
	private Map<String, Object> updateMenu(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = menuService.updateMenu(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("updateMenu", check);
			
		return reqMap;
	}
	
	//ajax 호출  메뉴권한 
	@ResponseBody
	@RequestMapping(value="/authMenu.do")
	private Map<String, Object> authMenu(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = menuService.authMenu(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("authMenu", check);
			
		return reqMap;
	}
}
