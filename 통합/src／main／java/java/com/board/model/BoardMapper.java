package com.board.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	
	List<HashMap<String,String>> selectBoardList();
	
	List<HashMap<String,String>> selectBoardList2();
	
	
}
