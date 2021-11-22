package com.menu.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
	
	//메뉴조회
	List<HashMap<String,String>> selectMenuList(HashMap<String,String> pMap);
	
	//메뉴추가
	int insertMenu(HashMap<String,String> pMap);
	
	//메뉴 변경
	int updateMenu(HashMap<String,String> pMap);
	
	//메뉴권한
	int authMenu(HashMap<String,String> pMap);
}
