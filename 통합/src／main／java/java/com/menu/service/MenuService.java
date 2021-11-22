package com.menu.service;

import java.util.HashMap;
import java.util.List;

public interface MenuService {
	
	//메뉴조회
	List<HashMap<String, String>> selectMenuList(HashMap<String, String> pMap);
	
	//메뉴 추가
	int insertMenu(HashMap<String, String> pMap);
	
	//메뉴 변경
	int updateMenu(HashMap<String, String> pMap);
	
	//메뉴 권한
	int authMenu(HashMap<String, String> pMap);
}
