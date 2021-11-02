package com.menu.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
	
	List<HashMap<String,String>> selectMenuList(HashMap<String,String> pMap);

}
