package com.menu.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menu.model.MenuMapper;
import com.menu.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	MenuMapper menuMapper;
	
	//메뉴조회
	@Override
	public List<HashMap<String, String>> selectMenuList(HashMap<String, String> pMap) {
		
		List<HashMap<String, String>> results = menuMapper.selectMenuList(pMap);
		
		return results;
	}
	
	//메뉴추가
	@Override
	public int insertMenu(HashMap<String, String> pMap) {
		
		int results = menuMapper.insertMenu(pMap);
		
		pMap.put("authId", "N");
		results = menuMapper.authMenu(pMap);
		
		return results;
	}
	
	//메뉴 변경
	@Override
	public int updateMenu(HashMap<String, String> pMap) {
		
		int results = menuMapper.updateMenu(pMap);
		
		return results;
	}
	
	//메뉴권한
	@Override
	public int authMenu(HashMap<String, String> pMap) {
		
		int results = menuMapper.authMenu(pMap);
		
		return results;
	}
	
}
