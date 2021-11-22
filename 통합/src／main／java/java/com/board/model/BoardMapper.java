package com.board.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	
	List<HashMap<String,String>> selectBoardList();
	
	//게시글 추가
	int insertBoards(HashMap<String,String> pMap);
	
	//게시글 수정
	int updateBoards(HashMap<String,String> pMap);
}
