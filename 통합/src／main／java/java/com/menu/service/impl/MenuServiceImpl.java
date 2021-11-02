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
	
	@Override
	public List<HashMap<String, String>> selectMenuList(HashMap<String, String> pMap) {
		
		List<HashMap<String, String>> results = menuMapper.selectMenuList(pMap);
		
		return results;
	}
	
}
