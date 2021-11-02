package com.menu.service;

import java.util.HashMap;
import java.util.List;

public interface MenuService {
	
	List<HashMap<String, String>> selectMenuList(HashMap<String, String> pMap);
	
}
