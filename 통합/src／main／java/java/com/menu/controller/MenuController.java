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
	
	//ajax 호출
	@ResponseBody
	@RequestMapping(value="/getMenuList.do")
	private Map<String, Object> getMenuList(@RequestBody HashMap<String, String> map) {
		
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		List<HashMap<String,String>> results = menuService.selectMenuList(map);
		
		reqMap.put("menuList", results);
		
		return reqMap;
	}
	
}
